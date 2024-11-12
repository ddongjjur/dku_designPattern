package commandPattern06;

public class SimpleProcessStopCommand implements Command {

	private SimpleProcess simpleProcess;
	
	public SimpleProcessStopCommand(SimpleProcess simpleProcess) {
		this.simpleProcess = simpleProcess;
	}
	
	@Override
	public void execute() {
		simpleProcess.stop();
	}

}
