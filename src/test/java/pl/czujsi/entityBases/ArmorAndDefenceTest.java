package pl.czujsi.entityBases;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

class ArmorAndDefenceTest {
    @Test
    void ArmorValueCannotBeNegative() {

        ThrowableAssert.ThrowingCallable throwingCallable = () -> new ArmorAndDefence(-50, 50);


        Assertions.assertThatThrownBy(throwingCallable)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Any armor value cannot be negative number");

    }

    @Test
    void ArmorResistanceValueCannotBeNegative() {

        ThrowableAssert.ThrowingCallable throwingCallable = () -> new ArmorAndDefence(50, -50);


        Assertions.assertThatThrownBy(throwingCallable)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Any armor value cannot be negative number and base armor cannot equals zero");

    }

    @Test
    void ArmorValueCannotEqualsZero() {

        ThrowableAssert.ThrowingCallable throwingCallable = () -> new ArmorAndDefence(0, 50);


        Assertions.assertThatThrownBy(throwingCallable)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Any armor value cannot be negative number and base armor cannot equals zero");

    }


}