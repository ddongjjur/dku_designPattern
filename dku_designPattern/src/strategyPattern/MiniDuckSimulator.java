package strategyPattern;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.quack();
		mallard.fly();
		mallard.swim();
		System.out.println();
   
		Duck redHead = new RedHeadDuck();
		redHead.display();
		redHead.quack();
		redHead.fly();
		redHead.swim();
		System.out.println();
		
		Duck rubber = new RubberDuck();
		rubber.display();
		rubber.quack();
		rubber.fly();
		rubber.swim();
		System.out.println();
		
		Duck decoy = new DecoyDuck();
		decoy.display();
		decoy.quack();
		decoy.fly();
		decoy.swim();
	}
}
