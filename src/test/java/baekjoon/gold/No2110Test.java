package baekjoon.gold;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2110Test {

    @Test
    @DisplayName("백준 No2110 테스트")
    void test2110() {
        // given
        int a = 5;
        int b = 3;
        int[] arr = {1,2,8,4,9};
        int expected = 3;

        // when
        int solution = No2110.solution(a, b, arr);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}