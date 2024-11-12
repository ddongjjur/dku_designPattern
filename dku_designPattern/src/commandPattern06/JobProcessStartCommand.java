package commandPattern06;

public class JobProcessStartCommand implements Command {
	
	private JobProcess jobprocess;
	
	public JobProcessStartCommand(JobProcess jobprocess) {
		this.jobprocess = jobprocess;
	}

	@Override
	public void execute() {
		jobprocess.start();
	}

}
