package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No18111Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    @DisplayName("백준 No18111 테스트")
    void test18111(int a) {
        // given
        int[] n = {3, 3, 3};
        int[] m = {4, 4, 4};
        int[] have = {99, 1, 0};
        int[][][] blocks = {{{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 1}}, {{64, 64, 64, 64,}, {64, 64, 64, 64}, {64, 64, 64, 63}}, {{64, 64, 64, 64}, {64, 64, 64, 64}, {64, 64, 64, 63}}};
        String[] expected = {"2 0", "1 64", "22 63"};

        // when
        String solution = No18111.solution(n[a], m[a], blocks[a], have[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}