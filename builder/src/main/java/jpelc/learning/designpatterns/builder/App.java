package jpelc.learning.designpatterns.builder;

public class App {

    public static void main(String[] args) {
        System.out.println(new Hero.HeroBuilder(Profession.MAGE, "Mage")
                .withHairColor(HairColor.BLACK)
                .withWeapon(Weapon.DAGGER)
                .build());

        System.out.println(new Hero.HeroBuilder(Profession.WARRIOR, "Warrior")
                .withHairColor(HairColor.BLOND)
                .withHairType(HairType.LONG_CURLY)
                .withArmor(Armor.CHAIN_MAIL)
                .withWeapon(Weapon.SWORD)
                .build());

        System.out.println(new Hero.HeroBuilder(Profession.THIEF, "Thief")
                .withHairType(HairType.BALD)
                .withWeapon(Weapon.BOW)
                .build());
    }

}
