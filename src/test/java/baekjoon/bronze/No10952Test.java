package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No10952Test {

    @ParameterizedTest
    @CsvSource(value = {"1 1:2", "2 3:5", "3 4:7", "9 8:17", "5 2:7"}, delimiter = ':')
    @DisplayName("백준 No10952 테스트")
    void test10952(String a, int expected) {
        // given

        // when
        int solution = No10952.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}