package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120803Test {
    @Test
    @DisplayName("프로그래머스 No120803 테스트")
    void test120803() {
        // given
        int a = 5;
        int b = 2;
        int expected = 3;

        // when
        int solution = No120803.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}