package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No1259Test {

    @Test
    @DisplayName("백준 No1259 테스트")
    void test1259() {
        // given
        List<String> a = new ArrayList<>(Arrays.asList("121", "1231", "12421", "0"));
        List<String> expected = new ArrayList<>(Arrays.asList("yes", "no", "yes"));

        // when
        List<String> solution = No1259.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}