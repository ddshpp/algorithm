package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No10816Test {

    @Test
    @DisplayName("백준 No10816 테스트")
    void test10816() {
        // given
        int n = 10;
        String haveCards = "6 3 2 10 10 10 -10 -10 7 3";
        int m = 8;
        String newCards = "10 9 -5 2 3 4 5 -10";
        int[] expected = {3, 0, 0, 1, 2, 0, 0, 2};

        // when
        int[] solution = No10816.solution(n, haveCards, m, newCards);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}