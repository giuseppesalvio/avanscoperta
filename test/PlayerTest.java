import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void create_a_player_that_start_with_score_to_0() {
        Player player = new Player();

        assertEquals(Score.ZERO, player.getScore());
    }

    @Test
    void create_a_player_that_start_with_score_to_LOVE() {
        Player player = new Player();
        player.setScrore(Score.LOVE);

        assertEquals(Score.LOVE, player.getScore());
    }
}
