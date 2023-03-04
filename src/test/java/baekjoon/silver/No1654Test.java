package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1654Test {
    @Test
    @DisplayName("백준 No1654 테스트")
    void test1654() {
        // given
        int k = 4;
        int n = 11;
        int[] arr = {802, 743, 457, 539};
        int expected = 200;

        // when
        long solution = No1654.solution(arr, k, n);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}