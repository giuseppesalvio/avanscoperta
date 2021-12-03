import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    @Test
    void exampleTest() {
        assertEquals(1, 2);
    }
    @Test
    void exampleTest2() {
        assertThat(1).isEqualTo(2);
    }
}
