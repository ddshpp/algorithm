package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No10817Test {

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3})
    @DisplayName("백준 No10817 테스트")
    void test10817(int a) {
        // given
        String[] input = {"20 30 10", "30 30 10", "40 40 40", "20 10 10"};
        int[] expected = {20, 30, 40, 10};

        // when
        int solution = No10817.solution(input[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}