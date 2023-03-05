package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2805Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    @DisplayName("백준 No2805 테스트")
    void test2805(int a) {
        // given
        int[][] arr = {{4, 7}, {5, 20}};
        int[][] arr2 = {{20, 15, 10, 17}, {4, 42, 40, 26, 46}};
        int[] max = {20, 46};
        Long[] expected = {15L, 36L};

        // when
        long solution = No2805.solution(arr2[a], arr[a][0], arr[a][1], max[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}