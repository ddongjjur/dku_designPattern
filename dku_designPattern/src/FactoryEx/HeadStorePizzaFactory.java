package FactoryEx;

public class HeadStorePizzaFactory extends PizzaFactory{

    @Override
	public Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("clam")) {
            return new ClamPizza();
        }
        return null;
    }
	
}
