package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1978Test {

    @Test
    @DisplayName("백준 No1978 테스트")
    void test1978() {
        // given
        String a = "1 3 5 7";
        int expected = 3;

        // when
        int solution = No1978.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}