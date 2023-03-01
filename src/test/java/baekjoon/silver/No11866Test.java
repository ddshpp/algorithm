package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No11866Test {

    @Test
    @DisplayName("백준 No11866 테스트")
    void test11866() {
        // given
        String a = "7 3";
        String expected = "<3, 6, 2, 7, 5, 1, 4>";

        // when
        String solution = No11866.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}