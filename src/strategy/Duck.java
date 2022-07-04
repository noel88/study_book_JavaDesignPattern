package strategy;

public abstract class Duck {
    //NOTE: 실행중에 알고리즘을 선택할 수 있게 하는 행위 소프트웨어 디자인 패턴
    // - 특정한 계열의 알고리즘을 정의
    // - 각 알고리즘을 캡술화
    // - 이 알고리즘을 해당 계열 안애서 상호 교체가 가능하게 만든다.
    // 전략은 알고리즘을 사용하는 클라이언트와는 독립적으로 다양하게 만든다.

    //장점:
    // - 전략 사용자의 코드 변경 없이 새로운 전략을 추가할 수 있다.
    // - 확장에 유리한 코드를 작성할 수 있다.
    // - 런타임에 전략을 변경할 수 있다.

    //단점:
    // - 어플리케이션에 들어가는 모든 전략을 알고 있어야 한다.
    // - 전략을 추상화한 인터페이스가 효율적이지 못할 수 있다.

    //NOTE: 변화된 것을 찾은 후 캡술화.
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 물에 뜹니다.");
    }

    abstract void display();

    void performQuack() {
        quackBehavior.quack();
    }
    void performFly() {
        flyBehavior.fly();
    }
    void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
