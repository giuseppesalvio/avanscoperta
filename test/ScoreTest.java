import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScoreTest {
    @Test
    void init_valore_null() {
        Score score = Score.from("ciccio");

        assertThat(score).isNull();
    }
    @Test
    void init_valore_0() {
        Score score = Score.from("0");

        assertThat(score).isEqualTo(Score.ZERO);
    }

    @Test
    void init_valore_LOVE() {
        Score score = Score.from("LOVE");

        assertThat(score).isEqualTo(Score.LOVE);
    }

}
