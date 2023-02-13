package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1845Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    @DisplayName("프로그래머스 No1845 테스트")
    void test1845(int a) {
        // given
        int[][] temp = {{3, 1, 2, 3}, {3, 3, 3, 2, 2, 4}, {3, 3, 3, 2, 2, 2}};
        int[] expected = {2, 3, 2};

        // when
        int solution = No1845.solution(temp[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}