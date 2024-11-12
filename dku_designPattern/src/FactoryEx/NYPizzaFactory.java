package FactoryEx;

public class NYPizzaFactory extends PizzaFactory{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		
		else if (type.equals("cheeze")) {
			pizza = new NYStyleCheesePizza();
		}
		
		else if (type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		}
		
		
		return pizza;
	}
	
}
