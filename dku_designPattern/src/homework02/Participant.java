package homework02;

public class Participant {
    private String name = null;
    private String buffer = "";

    public Participant(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("[" + name + "]");
        System.out.println(buffer);
    }

    public void inputln(String line) {
        buffer += line;
        buffer += "\n";
    }   
}