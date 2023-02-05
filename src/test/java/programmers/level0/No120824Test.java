package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120824Test {

    @Test
    @DisplayName("프로그래머스 No120824 테스트")
    void test120824() {
        // given
        int[] a = {1, 2, 3, 4, 5};
        int[] expected = {2, 3};

        // when
        int[] solution = No120824.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}