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

        // when
        for (int i = 1; i < 10; i++) {
            String b = a + " * " + i + " = " + a * i;
            expected.add(b);
        }
        List<String> solution = No2739.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}