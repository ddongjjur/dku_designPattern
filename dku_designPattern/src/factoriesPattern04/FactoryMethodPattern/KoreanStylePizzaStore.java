package factoriesPattern04.FactoryMethodPattern;

public class KoreanStylePizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		
		Pizza pizza = null;
		
		if (type.equals("cheeze")) {
			pizza = new ChicagoStyleCheesePizza();
		}
		
		else if (type.equals("clam")) {
			pizza = new NYStyleClamPizza();
		}
		
		
		return pizza;
	}

}
