package factoriesPattern04;

public abstract class PizzaStore {
	
//	SimplePizzaFactory factory;
	
//	public PizzaStore(SimplePizzaFactory factory) {
//		this.factory = factory;
//	}
	
	public Pizza orderPizza(String type) {
			
		Pizza pizza;
		
//		pizza = SimplePizzaFactory.createPizza(type);	// SimplePizzaFactory를 Static으로 만듦으로 인한 코드 수정 다만 메모리 관리에 영향을 준다.
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
		
	}

	public abstract Pizza createPizza(String type);
	
	

}
