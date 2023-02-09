package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No3052Test {

    @Test
    @DisplayName("백준 No3052 테스트")
    void test3052() {
        // given
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> b = new ArrayList<>(Arrays.asList(42, 84, 252, 420, 840, 126, 42, 84, 420, 126));
        List<Integer> c = new ArrayList<>(Arrays.asList(39, 40, 41, 42, 43, 44, 82, 83, 84, 85));
        int expected1 = 10;
        int expected2 = 1;
        int expected3 = 6;

        // when
        int solution1 = No3052.solution(a);
        int solution2 = No3052.solution(b);
        int solution3 = No3052.solution(c);

        // then
        assertThat(solution1).isEqualTo(expected1);
        assertThat(solution2).isEqualTo(expected2);
        assertThat(solution3).isEqualTo(expected3);
    }
}