package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No2231Test {

    @Test
    @DisplayName("백준 No2231 테스트")
    void test2231() {
        // given
        int a = 216;
        int expected = 198;

        // when
        int solution = No2231.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}