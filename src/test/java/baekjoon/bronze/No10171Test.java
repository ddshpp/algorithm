package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No10171Test {

    @Test
    @DisplayName("백준 No10171 테스트")
    void test10171() {
        // given
        String[] expected = new String[4];
        expected[0] = "\\    /\\";
        expected[1] = " )  ( ')";
        expected[2] = "(  /  )";
        expected[3] = " \\(__)|";
        
        // when
        String[] solution = No10171.solution();

        // then
        assertThat(solution).isEqualTo(expected);
    }
}