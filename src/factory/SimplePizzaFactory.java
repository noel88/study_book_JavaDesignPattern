package factory;

public class SimplePizzaFactory {
    //팩토리 페턴
    // - 구체적인 객체의 생성 과정을 '팩토리'로 모듈화 하여 구체적인 부분이 아닌 추상적인 부분에 의존할 수 있도록 한다.
    // 팩토리 메서드 패턴을 사용하는 이유는 클래스간의 결합도를 낮추기 위함.

    // - 팩토리 메서드 패턴 : 상속을 통해 서브 클래스에 팩토리 메서드를 오버라이딩하여 객체의 생성부를 구현
    // - 추상 팩토리 패턴 : 객체의 집합을 생성하기 위한 정의를 추상체에 위치시키고 하위의 구현체에서 세부적인 집합 생성 과정을 구현


    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
