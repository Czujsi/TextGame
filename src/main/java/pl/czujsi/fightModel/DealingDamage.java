package pl.czujsi.fightModel;

import pl.czujsi.DarkElf;
import pl.czujsi.WhiteElf;


public class DealingDamage {
    DarkElf darkElf = new DarkElf();
    WhiteElf whiteElf = new WhiteElf();
    protected double attackDamage = darkElf.getOverallAttackDamage();
    protected double armorResist = whiteElf.getArmorResist();
    protected double healthPoints = whiteElf.getOverallHealthPoints();
    DamageCounter damageCounter = new DamageCounter(healthPoints, attackDamage, armorResist);

    public double getDamageCounter() {
        return damageCounter.getAttackForAnotherEntity();
    }

    public double getArmorResist() {
        return armorResist;
    }
}
