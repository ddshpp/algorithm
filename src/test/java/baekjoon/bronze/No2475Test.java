package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2475Test {

    @Test
    @DisplayName("백준 No2475 테스트")
    void test2475() {
        // given
        String a = "0 4 2 5 6";
        int expected = 1;

        // when
        int solution = No2475.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}