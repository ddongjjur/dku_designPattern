package strategyPattern01;

public class FlyWithWings implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("Fly With Wings!!");
	}

}
