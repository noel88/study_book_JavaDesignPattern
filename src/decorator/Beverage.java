package decorator;

public abstract class Beverage {

    //NOTE: 데코레이터 패턴
    // - 객체에 추가 요소를 동적으로 더할 수 있다.
    // - 데코레이터를 사용하면 서브 클래스를 만들 때보다 훨씬 유연하게 기능을 확장할 수 있다.

    // - 데코레이터의 슈퍼클래스는 자신이 장식하고 있는 객체의 슈퍼 클래스와 같다.
    // - 한 객체를 여러 데코레이터로 감쌀 수 있다.
    // - 데코레이터는 자신이 감싸고 있는 객체와 같은 슈퍼클래스를 가지고 있기에 원래 객체가 들어갈 자리에 데코레이터 객체를 넣어도 상관없다.
    // - 데코레이터는 자신이 장식하고 있는 객체에게 어떤 행동을 위임하는 일 말고도 추가 작업을 수행할 수 있다.
    // - 객체는 언제든지 감쌀 수 있으므로 실행 중에 필요한 데코레이터를 마음대로 적용할 수 있다.


    //Component: 실질적인 인스턴스를 컨트롤하는 역할.
    //ConcreteComponent: Component의 실질적인 인스턴스의 부분으로 책임의 주체의 역할.
    //Decorator: Component와 ConcreteDecorator를 동일시 하도록 해주는 역할.
    //ConcreteDecorator: 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체.
    
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
