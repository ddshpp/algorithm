package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No120802Test {
    @Test
    @DisplayName("프로그래머스 No120802 테스트")
    void test120802() {
        // given
        int a = 1;
        int b = 3;
        int expected = 4;

        // when
        int solution = No120802.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}