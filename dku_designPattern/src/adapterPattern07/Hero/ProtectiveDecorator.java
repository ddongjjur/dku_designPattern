package adapterPattern07.Hero;

public class ProtectiveDecorator extends HeroDecorator {
    private String armorType;

    public ProtectiveDecorator(Hero hero, String armorType) {
        super(hero);
        this.armorType = armorType;
    }

    @Override
    public String toString() {
        return super.toString() + " wearing " + armorType;
    }
}
