package factoriesPattern04.FactoryMethodPattern;

public class ChicagoStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if(type.equals("cheeze")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		else if(type.equals("pepperoni")) {
			pizza = new ChicagoStylePepperoniPizza();
		}
		else if(type.equals("clam")) {
			pizza = new ChicagoStyleClamPizza();
		}
		else if(type.equals("veggle")) {
			pizza = new ChicagoStyleVeggiePizza();
		}
		
		return pizza;
	}
	
}
