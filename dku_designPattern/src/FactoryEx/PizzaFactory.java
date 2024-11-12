package FactoryEx;

public abstract class PizzaFactory {
	
	public Pizza orderPizza(String type) {
		
		Pizza pizza;
		
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}

	public abstract Pizza createPizza(String type);

	public Pizza getClamPizza() {
		
		return new ClamPizza();
	}

	public Pizza getCheesePizza() {
		
		return new CheesePizza();
	}

	public Pizza getPepperoniPizza() {

		return new PepperoniPizza();
	}
	
}
