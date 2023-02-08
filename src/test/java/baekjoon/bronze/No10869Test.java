package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No10869Test {

    @Test
    @DisplayName("백준 No10869 테스트")
    void test10869() {
        // given
        String a = "7 3";
        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 4, 21, 2, 1));
        
        // when
        List<Integer> solution = No10869.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}