package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2557Test {

    @Test
    @DisplayName("백준 No2557 테스트")
    void test2557() {
        // given
        String expected = "Hello World!";

        // when
        String soultion = No2557.solution();

        // then
        assertThat(soultion).isEqualTo(expected);
    }
}