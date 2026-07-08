import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Loadout newbie = new Loadout();

        ArrayList<String> mods1 = new ArrayList<>();
        mods1.add("AttackSpeed");
        mods1.add("HealthBoost");

        ArrayList<String> mods2 = new ArrayList<>();
        mods2.add("Fire");

        Loadout fighter = new Loadout(WeaponType.Sword, ArmorType.Plate, mods1);
        Loadout mage = new Loadout(WeaponType.Staff, ArmorType.Cloth, mods2);
        mage.addModifier(ModifierType.Ice.name());
        mage.addModifier(ModifierType.Lightning.name());

        System.out.println("Your old Loadout: ");
        System.out.println(newbie);

        newbie.setWeapon(WeaponType.Staff);
        newbie.setArmor(ArmorType.Cloth);
        newbie.addModifier("Lightning");
        newbie.addModifier("fiRe");
        //newbie.addModifier("beginersLuck");
        newbie.addModifier("Ice");
        //newbie.addModifier("Fire");

        System.out.println("Your new Loadout: ");
        System.out.println(newbie);

        System.out.println("You are now officially a beginner Mage!");

        System.out.println("Equal to fighter: " + newbie.equals(fighter));
        System.out.println("Equal to mage: " + newbie.equals(mage));
    }
}