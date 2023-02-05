package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120833Test {

    @Test
    @DisplayName("프로그래머스 No120833 테스트")
    void test120833() {
        // given
        int[] array = {1, 2, 3, 4, 5};
        int a = 1;
        int b = 3;
        int[] expected = {2, 3, 4};

        // when
        int[] solution = No120833.solution(array, a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}