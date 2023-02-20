package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No15829Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    @DisplayName("백준 No15829 테스트")
    void test15829(int a) {
        // given
        int[] b = {5, 3, 1};
        String[] c = {"abcde", "zzz", "i"};
        int[] expected = {4739715, 25818, 9};

        // when
        long solution = No15829.solution(b[a], c[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}