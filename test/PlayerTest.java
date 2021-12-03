import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    @Test
    void creo_un_player_che_inizia_con_score_a_0() {
        Player player = new Player();

        assertThat(player.getScore()).isEqualTo(Score.ZERO);
    }

    @Test
    void creo_un_player_e_modifico_lo_score_in_LOVE() {
        Player player = new Player();
        player.setScrore(Score.LOVE);

        assertThat(player.getScore()).isEqualTo(Score.LOVE);
    }


}
