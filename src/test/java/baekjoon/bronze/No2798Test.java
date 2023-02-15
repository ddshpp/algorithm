package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2798Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    @DisplayName("백준 No2798 테스트")
    void test2798(int a) {
        // given
        String[][] arr = {{"5 21", "5 6 7 8 9"}, {"10 500", "93 181 245 214 315 36 185 138 216 295"}};
        int[] expected = {21, 497};

        // when
        int solution = No2798.solution(arr[a][0], arr[a][1]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}