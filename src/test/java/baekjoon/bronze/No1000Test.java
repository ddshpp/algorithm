package baekjoon.bronze;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class No1000Test {

    @Test
    @DisplayName("백준 No1000 테스트")
    void test1000() {
        // given
        int a = 1;
        int b = 2;
        int expected = 3;

        // when
        int solution = No1000.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}