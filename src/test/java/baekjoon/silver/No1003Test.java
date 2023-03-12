package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1003Test {

    @ParameterizedTest
    @ValueSource(ints = {0,1})
    @DisplayName("백준 No1003 테스트")
    void test1003(int a) {
        // given
        int[] test = {3, 2};
        int[][] arr = {{0, 1, 3}, {6, 22}};
        int[][][] expected = {{{1, 0}, {0, 1}, {1, 2}},{{5, 8}, {10946, 17711}}};

        // when
        int[][] solution = No1003.solution(arr[a], test[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}