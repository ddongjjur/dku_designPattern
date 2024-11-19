package adapterPattern07.Hero;

public class App {
    public static void main(String[] args) {
        // OrdinaryFighter 생성
        HeroFactory ordinaryFighterFactory = new FighterFactory("Ordinary");
        Hero ordinaryFighter = ordinaryFighterFactory.createHero();
        ordinaryFighter = ordinaryFighterFactory.equipWeapon(ordinaryFighter);
        ordinaryFighter = ordinaryFighterFactory.equipArmor(ordinaryFighter);
        System.out.println(ordinaryFighter);

        // RoyalFighter 생성
        HeroFactory royalFighterFactory = new FighterFactory("Royal");
        Hero royalFighter = royalFighterFactory.createHero();
        royalFighter = royalFighterFactory.equipWeapon(royalFighter);
        royalFighter = royalFighterFactory.equipArmor(royalFighter);
        System.out.println(royalFighter);

        // OrdinaryWizard 생성
        HeroFactory ordinaryWizardFactory = new WizardFactory("Ordinary");
        Hero ordinaryWizard = ordinaryWizardFactory.createHero();
        ordinaryWizard = ordinaryWizardFactory.equipWeapon(ordinaryWizard);
        ordinaryWizard = ordinaryWizardFactory.equipArmor(ordinaryWizard);
        System.out.println(ordinaryWizard);

        // RoyalWizard 생성
        HeroFactory royalWizardFactory = new WizardFactory("Royal");
        Hero royalWizard = royalWizardFactory.createHero();
        royalWizard = royalWizardFactory.equipWeapon(royalWizard);
        royalWizard = royalWizardFactory.equipArmor(royalWizard);
        System.out.println(royalWizard);

        // CommonArcher 생성
        HeroFactory commonArcherFactory = new ArcherAndThiefFactory("Common");
        Hero commonArcher = commonArcherFactory.createHero();
        commonArcher = commonArcherFactory.equipWeapon(commonArcher);
        commonArcher = commonArcherFactory.equipArmor(commonArcher);
        System.out.println(commonArcher);

        // PoorThief 생성
        HeroFactory poorThiefFactory = new ArcherAndThiefFactory("Poor");
        Hero poorThief = poorThiefFactory.createHero();
        poorThief = poorThiefFactory.equipWeapon(poorThief);
        poorThief = poorThiefFactory.equipArmor(poorThief);
        System.out.println(poorThief);
    }
}

