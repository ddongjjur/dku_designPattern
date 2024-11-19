package adapterPattern07.Hero;

public class WizardFactory implements HeroFactory{
	private String type;
	private int count = 0;
	
	public WizardFactory(String type) {
		this.type = type;
	}

	@Override
	public Hero createHero() {
		return new Hero(type + " Wizard", type + "Wizard " + ++count);
	}

	@Override
	public Hero equipWeapon(Hero hero) {
		
        if (type.equals("Ordinary")) {
            return new WeaponDecorator(hero, "Whip");
        } 
        
        else if (type.equals("Royal")) {
            return new WeaponDecorator(hero, "Wand");
        }
		return null;
	}

	@Override
	public Hero equipArmor(Hero hero) {
		
        if (type.equals("Ordinary")) {
            return new WeaponDecorator(hero, "Hood");
        } 
        
        else if (type.equals("Royal")) {
            return new WeaponDecorator(hero, "Cloak");
        }
        
        return null;
	}

}
