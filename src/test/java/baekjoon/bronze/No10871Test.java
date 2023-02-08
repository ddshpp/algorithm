package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No10871Test {

    @Test
    @DisplayName("백준 No10871 테스트")
    void test10871() {
        // given
        String expected = "1 4 2 3";
        List<Integer> a = new ArrayList<>(Arrays.asList(1, 10, 4, 9, 2, 3, 8, 5, 7, 6, 10, 5));

        // when
        String solution = No10871.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}