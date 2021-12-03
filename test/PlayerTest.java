import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    @Test
    void init_player_ha_uno_score_a_0() {
        Player player = new Player();

        assertThat(player.getScore()).isEqualTo(Score.ZERO);
    }

    @Test
    void modifica_lo_score_di_player_con_LOVE() {
        Player player = new Player();
        player.setScrore(Score.LOVE);

        assertThat(player.getScore()).isEqualTo(Score.LOVE);
    }


}
