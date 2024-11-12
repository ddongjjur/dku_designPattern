package commandPattern06;

public class WorkerIsJobAssignedCommand implements Command {

	private Worker worker;
	
	public WorkerIsJobAssignedCommand(Worker worker) {
		this.worker = worker;
	}
	
	@Override
	public void execute() {
		worker.isJobAssigned();
	}

}
