package pl.czujsi;

import pl.czujsi.entityBases.*;

public class DarkElf extends EntityRequirements {

    public DarkElf() {
        super(new HealthPoints(250.00, 0.00, 5.50),
                new MovementSpeed(45.00, 15.00),
                new ArmorAndDefence(25.00, 15.25),
                new AttackDamage(35.00, 19.00));
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
}
