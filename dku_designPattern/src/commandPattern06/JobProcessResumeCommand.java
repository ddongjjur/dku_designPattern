package commandPattern06;

public class JobProcessResumeCommand implements Command {
	
	private JobProcess jobProcess;
	
	public JobProcessResumeCommand(JobProcess jobProcess) {
		this.jobProcess = jobProcess;
	}

	@Override
	public void execute() {
		jobProcess.resume();
	}

}
