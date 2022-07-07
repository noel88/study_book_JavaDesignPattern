package factory;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYPizzaStore();

        nyPizzaStore.orderPizza("cheese");
        nyPizzaStore.orderPizza("veggie");

    }
}
