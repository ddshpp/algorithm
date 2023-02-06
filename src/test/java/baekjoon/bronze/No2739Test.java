package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2739Test {

    @Test
    @DisplayName("백준 No2739 테스트")
    void test2739() {
        // given
        int a = 2;
        List<String> expected = new ArrayList<>();
        expected.add("2 * 1 = 2");
        expected.add("2 * 2 = 4");
        expected.add("2 * 3 = 6");
        expected.add("2 * 4 = 8");
        expected.add("2 * 5 = 10");
        expected.add("2 * 6 = 12");
        expected.add("2 * 7 = 14");
        expected.add("2 * 8 = 16");
        expected.add("2 * 9 = 18");

        // when
        List<String> solution = No2739.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}