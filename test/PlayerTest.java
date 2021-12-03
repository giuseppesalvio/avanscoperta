import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    @Test
    void init_player_ha_uno_score_a_0() {
        Player player = new Player();

        assertThat(player.getScore()).isEqualTo("0");
    }

    @Test
    void modifica_lo_score_di_player_con_LOVE() {
        Player player = new Player();
        player.setScrore("LOVE");

        assertThat(player.getScore()).isEqualTo("LOVE");
    }


}
