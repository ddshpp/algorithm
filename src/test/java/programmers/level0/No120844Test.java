package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120844Test {

    @Test
    @DisplayName("프로그래머스 No120844 테스트")
    void test120844() {
        // given]
        int[] a = {4, 455, 6, 4, -1, 45, 6};
        String b = "left";
        int[] expected = {455, 6, 4, -1, 45, 6, 4};

        // when
        int[] solution = No120844.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}