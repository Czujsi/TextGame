package pl.czujsi;

import pl.czujsi.entityBases.*;

public class Player extends EntityRequirements {

    public Player() {
        super(new HealthPoints(350.00, 0.00, 10.05),
                new MovementSpeed(55.00, 23.00),
                new ArmorAndDefence(54.00, 56.25),
                new AttackDamage(95.00, 55.00));
    }
    public double getOverallHealthPoints() {
        return healthPoints.getOverallHealthPoints();
    }

    public String writeHealthPointsRegeneration() {
        return healthPoints.writeHealthPointsRegeneration();
    }
    public String writeOverallHealth() {
        return healthPoints.writeOverallHealthPoints();
    }

    public double getOverallAttackDamage() {
        return attackDamage.getOverallAttackDamage();
    }

    public String writeBaseDamage() {
        return attackDamage.writeBaseDamage();
    }

    public String writeWeaponDamage() {
        return attackDamage.writeWeaponDamage();
    }

    public String writeOverallArmorAndDefence() {
        return armorAndDefence.writeOverallArmorAndDefence();
    }

    public double getArmor() {
        return armorAndDefence.getArmor();
    }

    public double getArmorResist() {
        return armorAndDefence.getArmorResist();
    }

    public void attack(){

    }
}
