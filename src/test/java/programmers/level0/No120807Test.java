package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120807Test {
    @ParameterizedTest
    @CsvSource(value = {"2:3:-1", "11:11:1", "7:99:-1"}, delimiter = ':')
    @DisplayName("프로그래머스 No120807 테스트")
    void test120807(int a, int b, int expected) {
        // given

        // when
        int solution = No120807.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}