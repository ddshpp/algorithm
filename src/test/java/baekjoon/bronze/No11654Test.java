package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No11654Test {

    @ParameterizedTest
    @CsvSource(value = {"A:65", "C:67", "0:48", "9:57", "a:97", "z:122"}, delimiter = ':')
    @DisplayName("백준 No11654 테스트")
    void test11654(String a, int expected) {
        // given

        // when
        int solution = No11654.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}