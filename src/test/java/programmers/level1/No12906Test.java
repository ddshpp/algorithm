package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No12906Test {
    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    @DisplayName("프로그래머스 No12906 테스트")
    void test12906(int a) {
        // given
        int[][] temp = {{1, 1, 3, 3, 0, 1, 1}, {4, 4, 4, 3, 3}};
        int[][] expected = {{1, 3, 0, 1}, {4, 3}};

        // when
        int[] arr = temp[a];

        int[] solution = No12906.solution(arr);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}