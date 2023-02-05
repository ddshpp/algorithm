package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120583Test {
    @Test
    @DisplayName("프로그래머스 No120583 테스트")
    void test120583() {
        // given
        int array[] = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int expected = 2;

        // when
        int solution = No120583.solution(array, n);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}