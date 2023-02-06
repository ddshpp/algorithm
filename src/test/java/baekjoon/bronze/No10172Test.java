package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No10172Test {

    @Test
    @DisplayName("백준 No10172 테스트")
    void test10172() {
        // given
        String[] expected = new String[5];
        expected[0] = "|\\_/|";
        expected[1] = "|q p|   /}";
        expected[2] = "( 0 )\"\"\"\\";
        expected[3] = "|\"^\"`    |";
        expected[4] = "||_/=\\\\__|";

        // when
        String[] solution = No10172.solution();

        // then
        assertThat(solution).isEqualTo(expected);
    }
}