package adapterPattern07;

public class TurkeyAdapter implements Duck {

	private Turkey turkey;
	
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quak() {
		turkey.gobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}

}
