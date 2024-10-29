package homework02;

public abstract class Participant implements Observer {
	protected String name;		// protected로 상속받는 class 접근
	protected String buffer = "";

	public Participant(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println("[" + name + "]");
		if (buffer.isEmpty()) {
			System.out.println();
		} 
		
		else {
			System.out.print(buffer);
		}
		System.out.println(); // 출력 간 간격을 위한 빈 줄
	}

	@Override	// update()와 inputln() 함수들은 추상메소드
	public abstract void update(String message);
	public abstract void inputln(Subject subject, String message);
}