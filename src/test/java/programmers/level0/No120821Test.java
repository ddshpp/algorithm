package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120821Test {

    @Test
    @DisplayName("프로그래머스 No120821 테스트")
    void test120821() {
        // given
        int[] a = {1, 0, 1, 1, 1, 3, 5};
        int[] expected = {5, 3, 1, 1, 1, 0, 1};

        // when
        int[] solution = No120821.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}