package pl.czujsi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class DarkElfTest {
    @Test
    void T1() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.getOverallHealthPoints()).isEqualTo(250.0);
    }

    @Test
    void T2() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.writeHealthPointsRegeneration()).isEqualTo("Health points regeneration is at: 5.5%");
    }

    @Test
    void T3() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.getOverallAttackDamage()).isEqualTo(54.00);
    }

    @Test
    void T4() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.writeOverallHealth()).isEqualTo("Health points: 250.0");
    }

    @Test
    void T5() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.writeBaseDamage()).isEqualTo("Base damage: 35.0");
    }

    @Test
    void T6() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.writeWeaponDamage()).isEqualTo("Weapon damage: 19.0");
    }

    @Test
    void T7() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.writeOverallArmorAndDefence())
                .isEqualTo("Armor: 25.0" + '\n' + "Armor Resist: 15.25");
    }

    @Test
    void T8() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.getArmor())
                .isEqualTo(25.0);
    }

    @Test
    void T9() {
        DarkElf darkElf = new DarkElf();

        Assertions.assertThat(darkElf.getArmorResist())
                .isEqualTo(15.25);
    }


}