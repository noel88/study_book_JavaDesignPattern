package singleton;

public class Singleton {

    // 싱글턴 패턴
    // - 클래스 인스턴스를 하나만 만들고, 그 인스턴스로의 전역 접근을 제공함.

    // ---- 일반적인 형태
    // 문제점
    // - 두 개 이상의 스레드가 인스턴스를 획득하기 위해 getInstance() 메서드에 진입하여 경합을 벌이는 과정에서 서로 다른 두개의 인스턴스가 만들어지는 형태가 발생할 여지가 있다.
    private static Singleton ourInstance = null;

    public static Singleton getInstance() {
        if (ourInstance == null) {
            ourInstance = new Singleton();
        }
        return ourInstance;
    }

    private Singleton() { }

    Singleton singleton = Singleton.getInstance();

    // ---- 해결방법 1
    // - 인스턴스를 필요할 때 생성하지 않고, 처음부터 인스턴스를 만들어 버린다. 단 인스턴스를 미리 만들어 버리게 되면, 불필요한 시스템 리소스를 낭비할 가능성이 있다.

    private static Singleton ourInstance1 = new Singleton();

    public static Singleton getInstance1() {
        return ourInstance1;
    }

    // ---- 해결방법 2
    // - getInstance() 메서드를 동기화 시킨다. 대신 메서드를 동기화 시키면 일반적으로 성능이 100배 정도 저하된다.

    private static Singleton ourInstance2 = null;

    public synchronized static Singleton getOurInstance2() {
        if (ourInstance2 == null) {
            ourInstance2 = new Singleton();
        }
        return ourInstance2;
    }

    // ---- 해결방법 3
    // - DCL 기법을 사용한다. 현재는 권고하지 않는 방법이다.

    private static Singleton ourInstance3 = null;

    public static Singleton getOurInstance3() {
        if (ourInstance3 == null) {
            synchronized (Singleton.class) {
                if (ourInstance3 == null) {
                    ourInstance3 = new Singleton();
                }
            }
        }
        return ourInstance3;
    }

    // ---- 해결방법 4
    // - LazyHolder 기법으로 synchronized 가 필요 없고, 자바 버전도 상관없는 방법.
    // - Singleton 클래스의 getInstance() 메서드에서 LazyHolder.INSTANCE를 참조하는 순간 class가 로딩되며 초기화 진행.
    // - Class를 로딩하고 초기화 하는 시점은 thread-safe를 보장하기 때문에 valatile이나 synchronized 같은 키워드가 없어도 된다.

    // LazyHolder 기법
    // context 의존성이 있는 환경일 경우, Singleton의 초기화 과정에 context라는 의존성이 끼어들 가능성이 있음.
    // JVM에게 객체의 초기화를 떠넘기는 방식. 멀티스레드 환경에서도 객체의 단일성을 보장할 수 있다.

    // 클래스 내부의 클래스는 외부의 클래스가 초기화 될 때 초기화되지 않고, 클래스의 static 변수는 클래스를 로딩할 때 초기화 되는 것을 이용한 기법.

    public static Singleton getInstance4() {
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
