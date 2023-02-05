package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120804Test {
    @Test
    @DisplayName("프로그래머스 No120804 테스트")
    void test120804() {
        // given
        int a = 3;
        int b = 3;
        int expected = 9;

        // when
        int solution = No120804.solution(a, b);
        
        // then
        assertThat(solution).isEqualTo(expected);
    }
}