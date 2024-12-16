package homework04;

import java.util.ArrayList;

public class Menu extends Item {
    private String name;
    private String description;
    private ArrayList<Item> items = new ArrayList<>();

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(Item item) {
        items.add(item);
    }

    public void remove(Item item) {
        items.remove(item);
    }
    
    public ArrayList<Item> getItems() {
        return items;
    }
    
    public Item getChild(int i) {
        return items.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void operation() {
        System.out.println("\n" + getName() + ", " + getDescription());
        System.out.println("---------------------");
        for (Item item : items) {
            item.operation(); // 자식 항목의 operation 호출
        }
    }
}
