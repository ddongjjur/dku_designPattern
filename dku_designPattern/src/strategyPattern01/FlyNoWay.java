package strategyPattern01;

public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly No Way...");
	}

}
