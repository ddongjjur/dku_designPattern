package commandPattern06;

public class JobProcessStopCommand implements Command {
	
	private JobProcess jobprocess;
	
	public JobProcessStopCommand(JobProcess jobprocess) {
		this.jobprocess = jobprocess;
	}

	@Override
	public void execute() {
		jobprocess.stop();
	}

}
