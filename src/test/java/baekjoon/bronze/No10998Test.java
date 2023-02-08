package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No10998Test {

    @ParameterizedTest
    @CsvSource(value = {"1 2:2", "3 4:12"}, delimiter = ':')
    @DisplayName("백준 No10998 테스트")
    void test10998(String a, int expected) {
        // given

        // when
        int solution = No10998.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}