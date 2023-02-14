package pl.czujsi.fightModel;



public class DamageCounter {
    protected double healthPoints;
    protected double attackDamage;
    protected double armorResist;



    public DamageCounter(double healthPoints, double attackDamage, double armorResit) {
        this.healthPoints = healthPoints;
        this.attackDamage = attackDamage;
        this.armorResist = armorResit;
    }

    public double getAttackForAnotherEntity() {
        return this.healthPoints - ((this.attackDamage * (100 - this.armorResist)) / 100);
    }
}
