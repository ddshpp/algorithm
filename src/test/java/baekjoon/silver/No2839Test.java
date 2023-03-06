package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2839Test {

    @ParameterizedTest
    @CsvSource(value = {"18:4", "4:-1", "6:2", "9:3", "11:3"}, delimiter = ':')
    @DisplayName("백준 No2839 테스트")
    void test2839(int a, int expected) {
        // given

        // when
        int solution = No2839.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}