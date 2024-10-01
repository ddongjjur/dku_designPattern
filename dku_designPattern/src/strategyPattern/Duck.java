package strategyPattern;

public abstract class Duck {
	protected FlyBehavior flyBehavior;
	protected QuackBehavior quackBehavior;
	
	public Duck() {
	}
	abstract void display();
	
	public void fly() {
		flyBehavior.fly();
	}
	public void quack() {
		quackBehavior.quack();
	}
	public void swim() {
		System.out.println("All ducks float.");
	}
}
