package adapterPattern07;

public class MallardDuck implements Duck {

	@Override
	public void quak() {
		System.out.println("꽥");
	}

	@Override
	public void fly() {
		System.out.println("날고 있어요!");
	}
	
}
