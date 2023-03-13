package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No86491Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    @DisplayName("프로그래머스 No86491 테스트")
    void test86491(int a) {
        // given
        int[][][] arr = {
                {{60, 50}, {30, 70}, {60, 30}, {80, 40}},
                {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}},
                {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}}
        };
        int[] expected = {4000, 120, 133};

        // when
        int solution = No86491.solution(arr[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}