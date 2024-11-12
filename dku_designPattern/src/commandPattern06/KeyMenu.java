package commandPattern06;

import java.util.ArrayList;
import java.util.Scanner;

public  class KeyMenu {
    private ArrayList<String> menu = new ArrayList<>();
    private ArrayList<Command> commands = new ArrayList<>();

    public void addItem(String menuDescription, Command command) {
        menu.add(menuDescription);
        commands.add(command);
    }

    public void showMenu() {
        for (String item : menu) {
            System.out.println(item);
        }
    }

    public int getKeyValue() {	// menu input 값 예외 처리
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x<0 || x>menu.size()) {
            System.out.println("Invalid key pressed");
            return -1;
        }  
        else return x;
    }

    public void menu() {
		showMenu();
		System.out.print("\nEnter your choice: ");
		commands.get(getKeyValue() - 1).execute();	// 시작 값: 1이기 때문
    }
}