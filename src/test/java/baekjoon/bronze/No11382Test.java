package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No11382Test {

    @Test
    @DisplayName("백준 No11382 테스트")
    void test11382() {
        // given
        String a = "77 77 7777";
        String expected = "7931";

        // when
        String solution = No11382.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}