package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No10039Test {
    @Test
    @DisplayName("백준 No10039 테스트")
    void test10039() {
        // given
        List<Integer> a = new ArrayList<>(Arrays.asList(10, 65, 100, 30, 95));
        int expected = 68;

        // when
        int solution = No10039.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}