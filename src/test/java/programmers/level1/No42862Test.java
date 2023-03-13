package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No42862Test {

    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    @DisplayName("프로그래머스 No42862 테스트")
    void test42862(int a) {
        // given
        int[] n = {5,5,3};
        int[][] lost = {
                {2,4},
                {2,4},
                {3}
        };
        int[][] reserve = {
                {1,3,5},
                {3},
                {1}
        };
        int[] expected = {5,4,2};

        // when
        int solution = No42862.solution(n[a], lost[a], reserve[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}