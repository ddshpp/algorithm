package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2164Test {

    @Test
    @DisplayName("백준 No2164 테스트")
    void test2164() {
        // given
        int a = 6;
        int expected = 4;

        // when
        int solution = No2164.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}