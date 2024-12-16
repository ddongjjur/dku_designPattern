package homework04;

import java.util.Iterator;

public class DinerMenuIterator extends Item implements Iterator<MenuItem> {
    private MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

	public boolean hasNext() {
		if (position >= items.length || items[position] == null) {
			return false;
		}
		else {
			return true;
		}
	}

	public MenuItem next() {
		MenuItem menuItem = items[position];
		position = position + 1;
		return menuItem;
	}
}
	