package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120851Test {
    @ParameterizedTest
    @CsvSource(value = {"aAb1B2cC34oOp:10", "1a2b3c4d123:16"}, delimiter = ':')
    @DisplayName("프로그래머스 No120851 테스트")
    void test120851(String a, int expected) {
        // given

        // when
        int solution = No120851.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}