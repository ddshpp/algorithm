package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No10872Test {

    @ParameterizedTest
    @CsvSource(value = {"10:3628800", "0:1"}, delimiter = ':')
    @DisplayName("백준 No10872 테스트")
    void test10872(int a, int expected) {
        // given

        // when
        int solution = No10872.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}