import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Loadout newbie = new Loadout();

        ArrayList<String> mods = new ArrayList<>();
        mods.add("AttackSpeed");
        mods.add("HealthBoost");

        Loadout fighter = new Loadout(WeaponType.Sword, ArmorType.Plate, mods);

        System.out.println("Your old Loadout: ");
        newbie.display();

        newbie.setWeapon(WeaponType.Staff);
        newbie.setArmor(ArmorType.Cloth);
        newbie.addModifier("Lightning");
        newbie.addModifier("Fire");
        newbie.addModifier("Ice");
        //newbie.addModifier("Fire");

        System.out.println("Your new Loadout: ");
        newbie.display();

        System.out.println("You are now officially a beginner Mage!");
    }
}