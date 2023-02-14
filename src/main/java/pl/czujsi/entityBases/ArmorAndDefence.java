package pl.czujsi.entityBases;


public class ArmorAndDefence {
    private final double armor;
    private final double armorResist;

    public ArmorAndDefence(double armor, double armorResist) {
        this.armor = armor;
        this.armorResist = armorResist;
        if (armor <= 0 || armorResist < 0)
            throw new IllegalArgumentException("Any armor value cannot be negative number and base armor cannot equals zero");

    }


    public String writeOverallArmorAndDefence() {
        return "Armor: " + this.armor + '\n' + "Armor Resist: " + this.armorResist;
    }

    public double getArmor() {
        return this.armor;
    }

    public double getArmorResist() {
        return this.armorResist;
    }
}
