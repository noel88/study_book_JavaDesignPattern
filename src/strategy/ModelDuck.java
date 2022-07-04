package strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("모형 오리 입니다.");
    }


}
