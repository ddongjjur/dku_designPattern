package factoriesPattern04;

public class App {

	public static void main(String[] args) {
		
		PizzaStore nyPizzaStore = new NYStylePizzaStore();
		nyPizzaStore.orderPizza("cheeze");
		
		PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();
		chicagoPizzaStore.orderPizza("pepperoni");
		
		PizzaStore koreaPizzaStore = new KoreanStylePizzaStore();
		koreaPizzaStore.orderPizza("cheeze");
		koreaPizzaStore.orderPizza("clam");
		
	}
	
}
