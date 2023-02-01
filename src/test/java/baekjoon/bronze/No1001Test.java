package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1001Test {

    @Test
    @DisplayName("1001번 테스트")
    void test1001() {
        // given
        int a = 3;
        int b = 2;
        int expected = 1;

        // when
        int solution = No1001.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}