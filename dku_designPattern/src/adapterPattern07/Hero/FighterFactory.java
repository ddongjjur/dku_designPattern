package adapterPattern07.Hero;

public class FighterFactory implements HeroFactory{
	private String type;
	private int count = 0;
	
	public FighterFactory(String type) {
		this.type = type;
	}

	@Override
	public Hero createHero() {
		return new Hero(type + " Fighter", type + " Fighter " + ++count);
	}

	@Override
	public Hero equipWeapon(Hero hero) {
		
        if (type.equals("Ordinary")) {
            return new WeaponDecorator(hero, "Dagger");
        } 
        
        else if (type.equals("Royal")) {
            return new WeaponDecorator(hero, "Sword");
        }
        return null;
	}

	@Override
	public Hero equipArmor(Hero hero) {
		
        if (type.equals("Ordinary")) {
            return new ProtectiveDecorator(hero, "LeatherMail");
        } 
        
        else if (type.equals("Royal")) {
            return new ProtectiveDecorator(hero, "Armor");
        }
        return null;
	}

}
