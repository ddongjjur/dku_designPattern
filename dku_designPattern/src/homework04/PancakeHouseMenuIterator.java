package homework04;

import java.util.ArrayList;

public class PancakeHouseMenuIterator extends Item {
    private ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> items) {
        this.items = items;
    }	
	

	public boolean hasNext() {
		if (position >= items.size() || items.get(position) == null) {
			return false;
		}
		else {
			return true;
		}
	}

	public MenuItem next() {
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}
	
}
