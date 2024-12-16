package homework04;

public class MenuTest {
    public static void main(String[] args) {
        // Pancake House Menu와 Diner Menu 정의
        Menu pancakeMenu = new Menu("PANCAKE MENU", "Breakfast");
        pancakeMenu.add(new MenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99));
        pancakeMenu.add(new MenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99));

        Menu dinerMenu = new Menu("DINER MENU", "Lunch");
        dinerMenu.add(new MenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99));
        dinerMenu.add(new MenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99));

        // Composite 구조 생성
        Menu allMenus = new Menu("ALL MENUS", "All menus combined");
        allMenus.add(pancakeMenu);
        allMenus.add(dinerMenu);

        // 전체 메뉴 출력
        System.out.println("\nFull Menu:");
        allMenus.operation();

        // 비건 메뉴 출력
        System.out.println("\nVegetarian Menu:");
        printVegetarianMenu(allMenus);
    }

    private static void printVegetarianMenu(Menu menu) {
    	
        for (Item item : menu.getItems()) { 
            if (item instanceof MenuItem) {
                if (item.isVegetarian()) { 
                    item.operation(); 
                }
            } 
            
            else if (item instanceof Menu) { 
                printVegetarianMenu((Menu) item); 
            }
        }
    }
}
