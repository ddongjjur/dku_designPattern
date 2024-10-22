//package factoriesPattern04;
//
//public class SimplePizzaFactory {
//	
//	static public Pizza createPizza(String type) {	// static으로 변경하였음
//		Pizza pizza = null;
//		
//		if(type.equals("cheeze")) {
//			pizza = new CheesePizza();
//		}
//		
//		else if(type.equals("pepperoni")) {
//			pizza = new PepperoniPizza();
//		}
//		else if(type.equals("clam")) {
//			pizza = new ClamPizza();
//		}
//		else if(type.equals("veggle")) {
//			pizza = new VeggiePizza();
//		}
//		
//		return pizza;
//	}
//
//}
