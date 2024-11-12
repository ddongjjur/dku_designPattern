package commandPattern06;

public class JobProcessSuspendCommand implements Command {
	
	private JobProcess jobProcess;
	
	public JobProcessSuspendCommand(JobProcess jobProcess) {
		this.jobProcess = jobProcess;
	}

	@Override
	public void execute() {
		jobProcess.suspend();
	}

}
