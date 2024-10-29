package homework02;

public class Monitor extends Participant {
	public Monitor(String name) {
		super(name);
	}

	@Override
	public void update(String message) {
	    buffer += message + "\n";	// 메시지를 버퍼에 추가
	}

	@Override
	public void inputln(Subject subject, String message) {
		 // Monitor는 메시지를 입력하지 않음
	 }
}
