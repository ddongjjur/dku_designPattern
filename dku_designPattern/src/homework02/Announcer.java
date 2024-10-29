package homework02;

public class Announcer extends Participant {
	
    public Announcer(String name) {
        super(name);
    }

    @Override
    public void update(String message) {
        // Announcer는 메시지를 수신하지 않음
    }

    @Override
    public void display() {
        System.out.println("[" + name + "]");
        System.out.println();
    }

    @Override
    public void inputln(Subject subject, String message) {
        subject.notifyObservers("[공지]: " + message, this);
    }
}
