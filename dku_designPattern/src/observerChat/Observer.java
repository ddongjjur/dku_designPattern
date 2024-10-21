package observerChat;

public class Observer { // 채팅방, 게임방, 개발방을 옵저버로 둔다. 옵저버 클래스를 정의하여 캡슐화
	
	public String roomName;
	
	public void receive(String msg) {
		System.out.println(this.roomName + "에서 메시지를 받음." + msg);
	}

}
