package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120809Test {

    @Test
    @DisplayName("프로그래머스 No120809 테스트")
    void test120809() {
        // given
        int[] numbers = {1, 2, 3, 4, 5};
        int[] expected = {2, 4, 6, 8, 10};

        // when
        int[] solution = No120809.solution(numbers);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}