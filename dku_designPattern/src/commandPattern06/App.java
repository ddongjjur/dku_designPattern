package commandPattern06;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Command!\n");
        
        SimpleProcess simpleProcess = new SimpleProcess();
        JobProcess jobProcess = new JobProcess();
        Worker worker = new Worker();

        KeyMenu keyMenu = new KeyMenu();
        
    	keyMenu.addItem("1. Start Simple Process", new SimpleProcessStartCommand(simpleProcess));
    	keyMenu.addItem("2. Start Job Process", new JobProcessStartCommand(jobProcess));
    	keyMenu.addItem("3. Stop Simple Process", new SimpleProcessStopCommand(simpleProcess));
    	keyMenu.addItem("4. Stop Job Process", new JobProcessStopCommand(jobProcess));
    	keyMenu.addItem("5. Suspend", new JobProcessSuspendCommand(jobProcess));
    	keyMenu.addItem("6. Resume", new JobProcessResumeCommand(jobProcess));
    	keyMenu.addItem("7. Assign", new WorkerAsignCommand(worker));
    	keyMenu.addItem("8. JobDone", new WorkerJobDoneCommand(worker));
    	keyMenu.addItem("9. IsJobAssigned", new WorkerIsJobAssignedCommand(worker));
    	
    	keyMenu.menu();
    	
    }
}
