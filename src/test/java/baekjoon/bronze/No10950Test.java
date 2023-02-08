package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No10950Test {

    @Test
    @DisplayName("백준 No10950 테스트")
    void test10950() {
        // given
        List<String> a = new ArrayList<>(Arrays.asList("1 1", "2 3", "3 4", "9 8", "5 2"));
        List<Integer> expected = new ArrayList<>(Arrays.asList(2, 5, 7, 17, 7));

        // when
        List<Integer> solution = No10950.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}