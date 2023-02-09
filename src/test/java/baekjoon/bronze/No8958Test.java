package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No8958Test {

    @Test
    @DisplayName("백준 No8958 테스트")
    void test8958() {
        // given
        int a = 5;
        List<String> b = new ArrayList<>(Arrays.asList("OOXXOXXOOO", "OOXXOOXXOO", "OXOXOXOXOXOXOX", "OOOOOOOOOO", "OOOOXOOOOXOOOOX"));
        List<Integer> expected = new ArrayList<>(Arrays.asList(10, 9, 7, 55, 30));

        // when
        List<Integer> solution = No8958.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}