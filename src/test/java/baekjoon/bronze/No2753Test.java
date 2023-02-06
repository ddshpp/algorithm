package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2753Test {

    @ParameterizedTest
    @CsvSource(value = {"2000:1", "1999:0"}, delimiter = ':')
    @DisplayName("백준 No2753 테스트")
    void test2753(int a, int expected) {
        // given

        // when
        int solution = No2753.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}