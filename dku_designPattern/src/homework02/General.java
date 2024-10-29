package homework02;

public class General extends Participant {
    public General(String name) {
        super(name);
    }

    @Override
    public void update(String message) {
        buffer += message + "\n";	// 메시지를 버퍼에 추가
    }

    @Override
    public void inputln(Subject subject, String message) {
        subject.notifyObservers(name + ": " + message, this);
        update(name + ": " + message);
    }
}
