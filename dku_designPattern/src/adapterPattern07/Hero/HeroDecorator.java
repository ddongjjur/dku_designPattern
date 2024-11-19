package adapterPattern07.Hero;

public class HeroDecorator extends Hero {
    protected Hero hero;

    public HeroDecorator(Hero hero) {
        super(hero.attribute, hero.name);
        this.hero = hero;
    }

    @Override
    public String toString() {
        return hero.toString();
    }
}

