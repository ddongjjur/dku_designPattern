package FactoryEx;

public abstract class MyPizzaStore {

    // orderPizza 메서드는 그대로 유지
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type); // 팩토리 메서드 호출
        if (pizza != null) {
            System.out.println("--- Making a " + pizza.getName() + " ---");
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("Pizza type not available.");
        }
        return pizza;
    }

    // 팩토리 메서드 - 하위 클래스에서 구현
    protected abstract Pizza createPizza(String type);
}
