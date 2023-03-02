package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No1920Test {

    @Test
    @DisplayName("백준 No1920 테스트")
    void test1920() {
        // given
        int[] a = {4, 1, 5, 2, 3};
        int[] b = {1, 3, 7, 9, 5};
        int bNum = 5;

        int[] expected = {1, 1, 0, 0, 1};

        // when
        int[] solution = No1920.solution2(a, b, bNum);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}