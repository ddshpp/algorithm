package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2775Test {

    @Test
    @DisplayName("백준 No2775 테스트")
    void test2775() {
        // given
        int b = 2;
        List<List<Integer>> a = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 3)),
                new ArrayList<>(Arrays.asList(2, 3))
        ));
        List<Integer> expected = new ArrayList<>(Arrays.asList(6, 10));

        // when
        List<Integer> solution = No2775.solution(b, a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}