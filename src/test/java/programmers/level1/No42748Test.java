package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No42748Test {

    @Test
    @DisplayName("프로그래머스 No42748 테스트")
    void test42748() {
        // given
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] expected = {5, 6, 3};

        // when
        int[] solution = No42748.solution(array, commands);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}