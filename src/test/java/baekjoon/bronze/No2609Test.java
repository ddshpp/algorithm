package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2609Test {

    @Test
    @DisplayName("백준 No2609 테스트")
    void test2609() {
        // given
        String a = "24 18";
        int[] expected = {6, 72};

        // when
        int[] solution = No2609.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}