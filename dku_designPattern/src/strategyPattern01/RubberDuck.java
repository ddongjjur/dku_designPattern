package strategyPattern01;

public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
	
	@Override
	void display() {
		System.out.println("I'm a real Rubber duck");		
	}

}
