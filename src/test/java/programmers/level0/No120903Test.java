package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120903Test {

    @Test
    @DisplayName("프로그래머스 No120903 테스트")
    void test120903() {
        // given
        String[] a = {"a", "b", "c"};
        String[] b = {"com", "b", "d", "p", "c"};
        int expected = 2;

        // when
        int solution = No120903.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}