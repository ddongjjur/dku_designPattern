package commandPattern06;

public class WorkerAsignCommand implements Command {

	private Worker worker;
	
	public WorkerAsignCommand(Worker worker) {
		this.worker = worker;
	}
	
	@Override
	public void execute() {
		worker.assignJob();
	}

}
