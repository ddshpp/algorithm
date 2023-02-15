package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2292Test {

    @ParameterizedTest
    @CsvSource(value = {"13:3","58:5","1:1"}, delimiter = ':')
    @DisplayName("메소드명")
    void name(int a, int expected) {
        // given

        // when
        int solution = No2292.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}