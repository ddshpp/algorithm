package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2884Test {

    @ParameterizedTest
    @CsvSource(value = {"10 10:9 25", "0 30:23 45", "23 40:22 55"}, delimiter = ':')
    @DisplayName("백준 No2884 테스트")
    void test2884(String a, String expected) {
        // given

        // when
        String solution = No2884.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}