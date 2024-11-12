package commandPattern06;

public class SimpleProcessStartCommand implements Command {

	private SimpleProcess simpleProcess;
	
	public SimpleProcessStartCommand(SimpleProcess simpleProcess) {
		this.simpleProcess = simpleProcess;
	}
	
	@Override
	public void execute() {
		simpleProcess.start();
	}

}
