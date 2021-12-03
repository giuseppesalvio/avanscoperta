import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    @Test
    void player_ha_uno_score() {
        Player player = new Player();

        assertThat(player.getScore()).isEqualTo("0");
    }

}
