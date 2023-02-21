package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No11050Test {

    @Test
    @DisplayName("백준 No11050 테스트")
    void test11050() {
        // given
        int a = 5;
        int b = 2;
        int expected = 10;

        // when
        int solution = No11050.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}