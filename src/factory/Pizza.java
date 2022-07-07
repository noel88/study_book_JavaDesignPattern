package factory;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;

    void prepare() {
        System.out.println("preparing~~ " + name);
    }

    void bake() {
        System.out.println("baking~~");
    }

    void cut() {
        System.out.println("cutting~~");
    }

    void box() {
        System.out.println("boxing~~");
    }

    public String getName() {
        return name;
    }
}
