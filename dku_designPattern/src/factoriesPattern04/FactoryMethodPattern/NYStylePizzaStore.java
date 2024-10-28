package factoriesPattern04.FactoryMethodPattern;

public class NYStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {

		Pizza pizza = null;
		
		if(type.equals("cheeze")) {
			pizza = new NYStyleCheesePizza();
		}
		else if(type.equals("pepperoni")) {
			pizza = new NYStylePepperoniPizza();
		}
		else if(type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		else if(type.equals("veggle")) {
			pizza = new NYStyleVeggiePizza();
		}
		
		return pizza;
	}

}
