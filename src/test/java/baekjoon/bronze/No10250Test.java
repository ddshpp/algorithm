package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No10250Test {

    @Test
    @DisplayName("백준 No10250번 테스트")
    void test10250() {
        // given
        List<String> a = new ArrayList<>(Arrays.asList("6 12 10", "30 50 72"));
        List<Integer> expected = new ArrayList<>(Arrays.asList(402, 1203));

        // when

        List<Integer> solution = No10250.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}