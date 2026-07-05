import java.util.ArrayList;

public class Loadout {
    private WeaponType weapon;
    private ArmorType armor;
    private ArrayList<String> modifiers;

    public Loadout() {
        this.weapon = WeaponType.Dagger;
        this.armor = ArmorType.Cloth;
        this.modifiers = new ArrayList<>();
    }

    public Loadout(WeaponType weapon, ArmorType armor, ArrayList<String> modifiers) {
        this.weapon = weapon;
        this.armor = armor;
        this.modifiers = modifiers;
    }
}