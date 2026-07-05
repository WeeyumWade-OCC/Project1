import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Loadout newbie = new Loadout();

        ArrayList<String> mods = new ArrayList<>();
        mods.add("AttackSpeed");
        mods.add("HealthBoost");

        Loadout fighter = new Loadout(WeaponType.Sword, ArmorType.Plate, mods);

        System.out.println("Loadouts created successfully!");
    }
}