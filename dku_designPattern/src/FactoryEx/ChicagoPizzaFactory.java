package FactoryEx;

public class ChicagoPizzaFactory extends PizzaFactory{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if (type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}
		
		else if (type.equals("cheese")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		
		else if (type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		
		
		return pizza;
	}

}
