import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class ScoreTest {
    @Test
    void init_valore_null() {
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

}
