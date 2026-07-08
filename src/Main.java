import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Loadout newbie = new Loadout();

        ArrayList<String> mods1 = new ArrayList<>();
        mods1.add("AttackSpeed");
        mods1.add("HealthBoost");

        ArrayList<String> mods2 = new ArrayList<>();
        mods2.add("Fire");

        ArrayList<String> noMods = new ArrayList<>();

        Loadout fighter = new Loadout(WeaponType.Sword, ArmorType.Plate, mods1);
        Loadout mage = new Loadout(WeaponType.Staff, ArmorType.Cloth, mods2);
        mage.addModifier(ModifierType.Ice.name());
        mage.addModifier(ModifierType.Lightning.name());
        Loadout thief = new Loadout(WeaponType.Dagger, ArmorType.Leather, noMods);
        Loadout dwarf = new Loadout(WeaponType.Axe, ArmorType.Chain, noMods);
        dwarf.addModifier(ModifierType.CritChance.name());
        dwarf.addModifier(ModifierType.DefenseBoost.name());

        System.out.println("Here are your teammates:");
        System.out.println("Fighter:\n" + fighter.toString());
        System.out.println("Theif:\n" + thief.toString());
        System.out.println("Mage:\n" + mage.toString());
        System.out.println("Dwarf:\n" + dwarf.toString());

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
        System.out.println("Equal to dwarf: " + newbie.equals(dwarf));

        System.out.println("You're not equal to a fighter, but who do you think is better?");
        if (newbie.compareTo(fighter) < 0) {
            System.out.println("The fighter is still stronger than you");
        } else if (newbie.compareTo(fighter) > 0) {
            System.out.println("Congratulations! you are better than a fighter!");
        }

        
    }
}