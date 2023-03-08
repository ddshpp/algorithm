package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2743Test {

    @Test
    @DisplayName("백준 No2743 테스트")
    void test2743() {
        // given
        String a = "pulljima";
        int expected = 8;

        // when
        int solution = No2743.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}