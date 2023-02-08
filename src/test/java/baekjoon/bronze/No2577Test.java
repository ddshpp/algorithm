package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2577Test {

    @Test
    @DisplayName("백준 No2577 테스트")
    void test2577() {
        // given
        int a = 150;
        int b = 266;
        int c = 427;
        List<Integer> expected = new ArrayList<>(Arrays.asList(3, 1, 0, 2, 0, 0, 0, 2, 0, 0));

        // when
        List<Integer> solution = No2577.solution(a, b, c);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}