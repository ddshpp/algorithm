package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No7568Test {

    @Test
    @DisplayName("백준 No7568 테스트")
    void test7568() {
        // given
        String[] arr = {"55 185", "58 183", "88 186", "60 175", "46 155"};
        int a = 5;
        int[] expected = {2, 2, 1, 2, 5};

        // when
        int[] solution = No7568.solution(arr, a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}