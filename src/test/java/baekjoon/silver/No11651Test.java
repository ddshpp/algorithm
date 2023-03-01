package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No11651Test {

    @Test
    @DisplayName("백준 No11651 테스트")
    void test11651() {
        // given
        int[][] arr = {{0, 4}, {1, 2}, {1, -1}, {2, 2}, {3, 3}};
        List<String> expected = new ArrayList<>(Arrays.asList("1 -1", "1 2", "2 2", "3 3", "0 4"));

        // when
        List<String> solution = No11651.solution(arr);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}