package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2869Test {
    @ParameterizedTest
    @CsvSource(value = {"2 1 5:4","5 1 6:2","100 99 1000000000:999999901"}, delimiter = ':')
    @DisplayName("백준 No2869 테스트")
    void test2869(String a, int expected) {
        // given

        // when
        int solution = No2869.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}