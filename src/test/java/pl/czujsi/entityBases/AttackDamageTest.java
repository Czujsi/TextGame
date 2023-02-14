package pl.czujsi.entityBases;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.catchThrowable;


class AttackDamageTest {
    @Test
    void IsDamageAdded() {
        AttackDamage attackDamage = new AttackDamage(50, 50);

        Assertions.assertThat(attackDamage.getOverallAttackDamage()).isEqualTo(100);
    }

    @Test
    void ThrowExceptionIfBaseDamageIsNegativeValue() {

        ThrowableAssert.ThrowingCallable throwingCallable = () -> new AttackDamage(-50, 50);


        Assertions.assertThatThrownBy(throwingCallable).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Any damage value cannot be negative number");

    }

    @Test
    void ThrowExceptionIfItemsDamageIsNegativeValue() {

        ThrowableAssert.ThrowingCallable throwingCallable = () -> new AttackDamage(50, -50);


        Assertions.assertThatThrownBy(throwingCallable).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Any damage value cannot be negative number");

    }
}