package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No10809Test {

    @Test
    @DisplayName("백준 No10809 테스트")
    void test10809() {
        // given
        String a = "baekjoon";
        List<Integer> expected = new ArrayList<>(Arrays.asList(1,0,-1,-1,2,-1,-1,-1,-1,4,3,-1,-1,7,5,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1,-1));

        // when

        List<Integer> solution = No10809.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}