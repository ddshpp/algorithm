package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2439Test {

    @Test
    @DisplayName("백준 No2439 테스트")
    void test2439() {
        // given
        String a = "5";
        List<String> expected = new ArrayList<>(Arrays.asList("    *", "   **", "  ***", " ****", "*****"));

        // when
        List<String> solution = No2439.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}