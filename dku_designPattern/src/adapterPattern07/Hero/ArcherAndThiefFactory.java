package adapterPattern07.Hero;

public class ArcherAndThiefFactory implements HeroFactory {
    private String type;
	private int count = 0;

    public ArcherAndThiefFactory(String type) {
        this.type = type;
    }

    @Override
    public Hero createHero() {
    	
        if (type.equals("Common")) {
            return new Hero("Common Archer", type + " Archer " + ++count);
        } 
        
        else if (type.equals("Poor")) {
            return new Hero("Poor Thief", type + " Thief " + ++count);
        }
        return null;
    }

    @Override
    public Hero equipWeapon(Hero hero) {
    	
        if (type.equals("Common")) {
            return new WeaponDecorator(hero, "Bow");
        } 
        
        else if (type.equals("Poor")) {
            return new WeaponDecorator(hero, "Dagger");
        }
        return null;
    }

    @Override
    public Hero equipArmor(Hero hero) {
    	
        if (type.equals("Common")) {
            return new ProtectiveDecorator(hero, "Cloak");
        } 
        
        else if (type.equals("Poor")) {
            return new ProtectiveDecorator(hero, "Hood");
        }
        return null;
    }
}

