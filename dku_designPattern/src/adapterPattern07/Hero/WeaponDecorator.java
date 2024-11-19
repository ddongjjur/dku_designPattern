package adapterPattern07.Hero;

public class WeaponDecorator extends HeroDecorator {
    private String weaponType;

    public WeaponDecorator(Hero hero, String weaponType) {
        super(hero);
        this.weaponType = weaponType;
    }

    @Override
    public String toString() {
        return super.toString() + " with a " + weaponType;
    }
}

