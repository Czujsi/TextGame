package pl.czujsi;

import pl.czujsi.entityBases.*;

public class WhiteElf extends EntityRequirements {
    public WhiteElf() {
        super(new HealthPoints(450.00, 0.00, 23.50),
                new MovementSpeed(45.00, 15.00),
                new ArmorAndDefence(35.00, 25.25),
                new AttackDamage(60.00, 54.00));
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
