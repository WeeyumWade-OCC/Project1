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

    public WeaponType getWeapon() {
        return this.weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public ArmorType getArmor() {
        return this.armor;
    }

    public void setArmor (ArmorType armor) {
        this.armor = armor;
    }

    public ArrayList<String> getModifiers() {
        return this.modifiers;
    }

    public void setModifiers (ArrayList<String> modifiers) {
        if (!modifiers.isEmpty()) {
            for (String i : modifiers) {
                if (!this.modifiers.contains(i)) {
                    this.modifiers.add(i);
                }
            }
        }
    }
}