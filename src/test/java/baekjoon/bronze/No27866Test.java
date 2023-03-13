package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No27866Test {

    @ParameterizedTest
    @CsvSource(value = {"Sprout:3:r", "shiftpsh:6:p", "Beakjoon:4:k"}, delimiter = ':')
    @DisplayName("백준 No27866 테스트")
    void test27866(String a, int b, char expected) {
        // given

        // when
        char solution = No27866.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}