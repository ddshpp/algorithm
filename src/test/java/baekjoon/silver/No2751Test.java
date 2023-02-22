package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2751Test {

    @Test
    @DisplayName("백준 No2751 테스트")
    void test2751() {
        // given
        List<Integer> a = new ArrayList<>(Arrays.asList(5,4,3,2,1));
        String expected = "1\n2\n3\n4\n5\n";

        // when
        String solution = No2751.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}