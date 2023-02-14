package pl.czujsi.fightModel;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DealingDamageTest {

    @Test
    void T5DealingDamage() {
        DealingDamage dealingDamage = new DealingDamage();

        Assertions.assertThat(dealingDamage.getDamageCounter()).isEqualTo(409.635);
    }
}