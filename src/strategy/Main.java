package strategy;

public class Main {

    public static void main(String[] args) {
        Duck duck1 = new MallardDuck();
        Duck duck2 = new RedHeadDuck();

        duck1.display();
        duck1.swim();
        duck1.performFly();
        duck1.performQuack();

        System.out.println("#######");

        duck2.display();
        duck2.swim();
        duck2.performFly();
        duck2.performQuack();

        System.out.println("#######");

        Duck duck3 = new ModelDuck();
        duck3.performFly();
        duck3.setFlyBehavior(new FlyRocketPowered());
        duck3.performFly();


    }
}
