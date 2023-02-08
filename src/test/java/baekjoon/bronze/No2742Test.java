package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2742Test {

    @Test
    @DisplayName("백준 No2742 테스트")
    void test2742() {
        // given
        String a = "5";
        List<Integer> expected = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));

        // when
        List<Integer> solution = No2742.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}