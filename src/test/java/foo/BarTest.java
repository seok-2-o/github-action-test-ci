package foo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BarTest {

    @Test
    @DisplayName("성공하는 테스트")
    void foo() {
        assertThat(true).isTrue();
    }

    @Test
    @DisplayName("실패하는 테스트")
    void bar() {
        assertThat(false).isTrue();
    }
}
