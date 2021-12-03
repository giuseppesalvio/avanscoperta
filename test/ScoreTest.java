import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ScoreTest {
    @Test
    void init_score_valore_to_invalid_value_get_null() {
        Score score = Score.from("ciccio");

       assertNull(score);

    }
    @Test
    void init_valore_0() {
        Score score = Score.from("0");

        assertEquals(Score.ZERO,score);
    }

    @Test
    void init_valore_LOVE() {
        Score score = Score.from("LOVE");

        assertEquals(Score.LOVE,score);
    }

    @Test
    void init_valore_15() {
        Score score = Score.from("15");

        assertEquals(Score.QUINDICI,score);
    }

    @Test
    void init_valore_30() {
        Score score = Score.from("30");

        assertEquals(Score.TRENTA,score);
    }

    @Test
    void init_valore_40() {
        Score score = Score.from("40");

        assertEquals(Score.QUARANTA,score);
    }
}
