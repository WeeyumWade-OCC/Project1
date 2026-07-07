import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Loadout newbie = new Loadout();

        ArrayList<String> mods = new ArrayList<>();
        mods.add("AttackSpeed");
        mods.add("HealthBoost");

        Loadout fighter = new Loadout(WeaponType.Sword, ArmorType.Plate, mods);

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
    }
}