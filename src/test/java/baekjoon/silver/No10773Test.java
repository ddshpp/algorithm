package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No10773Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    @DisplayName("백준 No10773 테스트")
    void test10773(int a) {
        // given
        int[] arr = {4, 10};
        int[][] arr2 = {{3, 0, 4, 0}, {1, 3, 5, 4, 0, 0, 7, 0, 0, 6}};
        int[] expected = {0,7};

        // when
        int solution = No10773.solution(arr[a], arr2[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}