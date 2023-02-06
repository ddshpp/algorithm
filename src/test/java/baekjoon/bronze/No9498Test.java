package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No9498Test {

    @Test
    @DisplayName("백준 No9498 테스트")
    void test9498() {
        // given
        int a = 100;
        String expected = "A";

        // when
        String solution = No9498.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}