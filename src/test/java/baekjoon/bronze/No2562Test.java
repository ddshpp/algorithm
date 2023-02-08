package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2562Test {

    @Test
    @DisplayName("백준 No2562 테스트")
    void test2562() {
        // given
        List<Integer> a = new ArrayList<>(Arrays.asList(3, 29, 38, 12, 57, 74, 40, 85, 61));
        List<Integer> expected = new ArrayList<>(Arrays.asList(85, 8));

        // when
        List<Integer> solution = No2562.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}