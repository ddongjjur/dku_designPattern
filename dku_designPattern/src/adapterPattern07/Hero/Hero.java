package adapterPattern07.Hero;

public class Hero {
	protected String attribute = null;
	protected String name = null;

    public Hero(String characteristic, String name) {
        this.attribute = characteristic;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero: " + name + " is a " + attribute;
    }
}

