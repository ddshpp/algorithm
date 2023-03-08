package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2588Test {

    @Test
    @DisplayName("백준 No2588 테스트")
    void test2588() {
        // given
        int a = 472;
        String b = "385";
        List<Integer> expected = new ArrayList<>(Arrays.asList(2360,3776,1416,181720));

        // when
        List<Integer> solution = No2588.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}