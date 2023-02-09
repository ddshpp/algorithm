package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2920Test {

    @ParameterizedTest
    @CsvSource(value = {"1 2 3 4 5 6 7 8:ascending", "8 7 6 5 4 3 2 1:descending", "8 1 7 2 6 3 5 4:mixed"}, delimiter = ':')
    @DisplayName("백준 No2920 테스트")
    void test2920(String a, String expected) {
        // given

        // when
        String solution = No2920.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}