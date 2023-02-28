package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2420Test {
    @Test
    @DisplayName("백준 No2420 테스트")
    void test2420() {
        // given
        String a = "-2 5";
        long expected = 7;

        // when
        Long solution = No2420.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}