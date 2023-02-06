package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2741Test {
    @Test
    @DisplayName("백준 No2741 테스트")
    void test2741() {
        // given
        int a = 5;
        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);

        // when
        List<Integer> solution = No2741.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}