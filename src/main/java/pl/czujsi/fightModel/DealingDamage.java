package pl.czujsi.fightModel;

import pl.czujsi.DarkElf;
import pl.czujsi.Player;
import pl.czujsi.WhiteElf;


public class DealingDamage {
    DarkElf darkElf = new DarkElf();
    Player player = new Player();
    protected double attackDamage = darkElf.getOverallAttackDamage();
    protected double armorResist = player.getArmorResist();
    protected double healthPoints = player.getOverallHealthPoints();
    DamageCounter damageCounter = new DamageCounter(healthPoints, attackDamage, armorResist);

    public double getDamageCounter() {
        return damageCounter.getAttackForAnotherEntity();
    }
}
