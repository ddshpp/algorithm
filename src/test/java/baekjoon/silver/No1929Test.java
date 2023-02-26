package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1929Test {

    private static final String NEW = System.lineSeparator();

    @Test
    @DisplayName("백준 No1929 테스트")
    void test1929() {
        // given
        int a = 3;
        int b = 16;
        String expected = "3\n5\n7\n11\n13\n";

        // when
        String solution = No1929.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}