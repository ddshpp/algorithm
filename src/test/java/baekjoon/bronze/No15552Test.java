package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No15552Test {

    @Test
    @DisplayName("백준 No15552 테스트")
    void test15552() throws IOException {
        // given
        int a = 5;
        int[][] arr = {{1, 1}, {12, 34}, {5, 500}, {40, 60}, {1000, 1000}};
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 46, 505, 100, 2000));

        // when
        List<Integer> solution = No15552.solution(arr, a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}