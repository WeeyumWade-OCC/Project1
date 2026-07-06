import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Loadout newbie = new Loadout();

        ArrayList<String> mods = new ArrayList<>();
        mods.add("AttackSpeed");
        mods.add("HealthBoost");

        Loadout fighter = new Loadout(WeaponType.Sword, ArmorType.Plate, mods);

        System.out.println("Your old weapon: " + newbie.getWeapon());
        System.out.println("Your old armor: " + newbie.getArmor());
        System.out.println("Your old modifiers: " + newbie.getModifiers());

        newbie.setWeapon(WeaponType.Staff);
        newbie.setArmor(ArmorType.Cloth);
        
        ArrayList<String> newbieMods = new ArrayList<>();
        newbieMods.add("Lightning");

        newbie.setModifiers(newbieMods);

        System.out.println("Your new weapon: " + newbie.getWeapon());
        System.out.println("Your new armor: " + newbie.getArmor());
        System.out.println("Your new modifiers: " + newbie.getModifiers());
        System.out.println("You are now officially a beginner Mage!");
    }
}