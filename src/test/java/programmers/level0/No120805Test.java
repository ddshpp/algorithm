package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120805Test {
    @Test
    @DisplayName("프로그래머스 No120805 테스트")
    void test120805() {
        // given
        int a = 10;
        int b = 4;
        int expected = 2;

        // when
        int solution = No120805.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}