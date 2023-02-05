package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120817Test {
    @Test
    @DisplayName("프로그래머스 No120817 테스트")
    void test120817() {
        // given
        int[] a = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        double expected = 94.0;

        // when
        double solution = No120817.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}