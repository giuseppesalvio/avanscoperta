import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    void creo_un_player_che_inizia_con_score_a_0() {
        Player player = new Player();

       assertEquals(Score.ZERO,player.getScore());
    }

    @Test
    void creo_un_player_e_modifico_lo_score_in_LOVE() {
        Player player = new Player();
        player.setScrore(Score.LOVE);

        assertEquals(Score.LOVE,player.getScore());
    }
}
