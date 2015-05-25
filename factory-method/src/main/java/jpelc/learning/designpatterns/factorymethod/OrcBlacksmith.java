package jpelc.learning.designpatterns.factorymethod;

public class OrcBlacksmith implements Blacksmith {

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return new OrcWeapon(weaponType);
    }
}
