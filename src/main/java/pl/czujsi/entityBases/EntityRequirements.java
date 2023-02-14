package pl.czujsi.entityBases;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class EntityRequirements {
    protected HealthPoints healthPoints;
    protected MovementSpeed movementSpeed;
    protected ArmorAndDefence armorAndDefence;
    protected AttackDamage attackDamage;
}
