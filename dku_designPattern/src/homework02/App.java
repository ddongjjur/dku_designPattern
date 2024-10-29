package homework02;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello, SNS!\n");
		
		// SNS방 생성 및 참여자들 생성
		Subject chatRoom = new Subject();
		Announcer announcer = new Announcer("Announcer");
		General you = new General("You");
		General me = new General("Me");
		Monitor monitor = new Monitor("Monitor");
		
		// 참여자들이 방에 입장
		chatRoom.attach(announcer);
		chatRoom.attach(you);
		chatRoom.attach(me);
		chatRoom.attach(monitor);
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
		
		    if (line.startsWith("announce ")) {
		    	announcer.inputln(chatRoom, line.substring(9));
			} 
			 
			else if (line.startsWith("me ")) {
			    me.inputln(chatRoom, line.substring(3));
			} 
			 
			else if (line.startsWith("you ")) {
			    you.inputln(chatRoom, line.substring(4));
			}
			
			// 각 참가자의 상태를 출력
			System.out.println("\n=== 현재 대화 상황 ===");
			announcer.display();
			you.display();
			me.display();
			monitor.display();
			
		}
		
		scanner.close();
	}
}
