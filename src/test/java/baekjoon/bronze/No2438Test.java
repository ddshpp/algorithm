package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2438Test {

    @Test
    @DisplayName("백준 No2438 테스트")
    void test2438() {
        // given
        int a = 5;
        List<String> expected = new ArrayList<>();

        // when
        String star = "*";
        for (int i = 0; i < a; i++) {
            expected.add(i, star);
            star += "*";
        }

        List<String> solution = No2438.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}