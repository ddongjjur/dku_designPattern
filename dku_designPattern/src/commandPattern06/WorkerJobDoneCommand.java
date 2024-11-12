package commandPattern06;

public class WorkerJobDoneCommand implements Command {

	private Worker worker;
	
	public WorkerJobDoneCommand(Worker worker) {
		this.worker = worker;
	}
	
	@Override
	public void execute() {
		worker.jobDone();
	}

}
