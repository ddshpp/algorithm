package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No11720Test {

    @ParameterizedTest
    @CsvSource(value = {"1:1:1", "5:54321:15", "25:7000000000000000000000000:7", "11:10987654321:46"}, delimiter = ':')
    @DisplayName("백준 No11720 테스트")
    void test11720(String a, String b, int expected) {
        // given

        // when
        int solution = No11720.solution(b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}