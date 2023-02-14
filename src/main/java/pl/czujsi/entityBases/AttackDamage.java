package pl.czujsi.entityBases;


public class AttackDamage {
    private final double baseDamage;
    private final double itemsDamage;

    public AttackDamage(double baseDamage, double itemsDamage) {

        this.baseDamage = baseDamage;
        this.itemsDamage = itemsDamage;
        if (baseDamage < 0 || itemsDamage < 0)
            throw new IllegalArgumentException("Any damage value cannot be negative number");
    }

    public double getOverallAttackDamage() {
        return this.baseDamage + this.itemsDamage;
    }

    public String writeBaseDamage() {
        return "Base damage: " + this.baseDamage;
    }

    public String writeWeaponDamage() {
        return "Weapon damage: " + this.itemsDamage;
    }
}
