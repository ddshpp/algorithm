package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1966Test {

    @Test
    @DisplayName("백준 No1966 테스트")
    void test1966() {
        // given
        int a = 3;
        String[][] arr = {{"1 0", "5"}, {"4 2", "1 2 3 4"}, {"6 0", "1 1 9 1 1 1"}};
        int[] expected = {1, 2, 5};

        // when
        int[] solution = No1966.solution(arr, 3);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}