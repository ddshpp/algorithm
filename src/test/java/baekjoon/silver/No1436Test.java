package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1436Test {
    @ParameterizedTest
    @CsvSource(value = {"2:1666", "3:2666", "6:5666", "187:66666", "500:166699"}, delimiter = ':')
    @DisplayName("백준 No1436 테스트")
    void test1436(int a, int expected) {
        // given

        // when
        int solution = No1436.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}