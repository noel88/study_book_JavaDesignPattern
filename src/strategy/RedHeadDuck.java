package strategy;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("머리가 빨간색인 오리");
    }
}
