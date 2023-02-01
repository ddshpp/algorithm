package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1008Test {
    @Test
    @DisplayName("1008번 테스트")
    void test1008() {
        // given
        double a = 1;
        double b = 3;
        double expected = 0.33333333333333333333333333333333;
        // when
        double solution = No1008.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}