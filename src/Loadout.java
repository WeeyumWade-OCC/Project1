import java.util.ArrayList;

public class Loadout implements Comparable<Loadout> {
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
        this.modifiers = modifiers;
    }

    // based on assignment requirements, this needs to take in a string
    public void addModifier (String modifier) {
        boolean validModifier = false;
        
        // first we make sure the string is a valid option
        for (ModifierType newModifier : ModifierType.values()) {
            if (newModifier.name().equalsIgnoreCase(modifier)) {
                validModifier = true;
                // now, check if the Loadout already contains the modifier
                if (!this.modifiers.contains(newModifier.name())) {
                    this.modifiers.add(newModifier.name());
                }
                else {
                    throw new IllegalArgumentException("The modifier, " + modifier + ", is already present");
                }
            }
        }

        if (!validModifier) {
            throw new IllegalArgumentException(modifier + " is not a valid modifier");
        }

    }

    @Override
    public String toString () {
        String output = "Weapon: " + this.weapon + "\n";
        output += "Armor: " + this.armor + "\n";
        output += "Modifiers (" + modifiers.size() + "):\n";
        
        //if there are no modifiers, print none
        if (this.modifiers.isEmpty()) {
            output += "\tnone";
        }
        else {
            for (String currentModifier : this.modifiers) {
                output += "\t" + currentModifier + "\n";
            }
        }

        return output;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Loadout)) {
            return false;
        }

        Loadout other = (Loadout) obj;
        
        return this.weapon == other.getWeapon()
            && this.armor == other.getArmor()
            && this.modifiers.size() == other.getModifiers().size();
    }

    @Override
    public int compareTo(Loadout other) {
        int result = Integer.compare(this.modifiers.size(), other.getModifiers().size());
        if (result != 0) {
            return result;
        }
        
        result = this.weapon.compareTo(other.getWeapon());
        if (result != 0) {
            return result;
        }

        result = this.armor.compareTo(other.getArmor());
            return result;
    }
}