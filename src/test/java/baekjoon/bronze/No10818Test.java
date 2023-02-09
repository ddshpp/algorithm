package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No10818Test {

    @Test
    @DisplayName("백준 No10818 테스트")
    void test10818() {
        // given
        int a = 5;
        String b = "20 10 35 30 7";
        String expected = "7 35";

        // when
        String solution = No10818.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}