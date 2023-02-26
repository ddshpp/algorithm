package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2581Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    @DisplayName("백준 No2581 테스트")
    void test2581(int a) {
        // given
        int[][] arr = {{60, 100}, {64, 65}};
        int[][] expected = {{620, 61}, {-1}};

        // when
        int[] solution = No2581.solution(arr[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}