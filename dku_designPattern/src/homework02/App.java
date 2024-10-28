package homework02;

import java.util.Scanner;

public class App {
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, SNS!\n");

        Participant announcer = new Participant("Announcer");
        Participant you = new Participant("You");
        Participant monitor = new Participant("Monitor");

        Participant[] participants = {announcer, you, monitor};

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            int i = line.charAt(0) - '0';
            participants[i].inputln(line);

            for (Participant participant : participants) {
                participant.display();
            }
        }
    }
}
