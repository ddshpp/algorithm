package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No4153Test {

    @Test
    @DisplayName("백준 No4153 테스트")
    void test4153() {
        // given
        List<String> a = new ArrayList<>(Arrays.asList("6 8 10", "25 52 60", "5 12 13", "0 0 0"));
        List<String> expected = new ArrayList<>(Arrays.asList("right", "wrong", "right"));

        // when
        List<String> solution = No4153.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}