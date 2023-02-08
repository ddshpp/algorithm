package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2675Test {

    @Test
    @DisplayName("백준 No2675 테스트")
    void test2675() {
        // given
        int a = 2;
        List<String> b = new ArrayList<>(Arrays.asList("3 ABC", "5 /HTP"));
        List<String> expected = new ArrayList<>(Arrays.asList("AAABBBCCC", "/////HHHHHTTTTTPPPPP"));

        // when
        List<String> solution = No2675.solution(2, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}