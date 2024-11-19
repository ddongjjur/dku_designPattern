package adapterPattern07.Hero;

public interface HeroFactory {
    Hero createHero();
    Hero equipWeapon(Hero hero);
    Hero equipArmor(Hero hero);
}