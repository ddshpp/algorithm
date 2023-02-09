package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1085Test {

    @ParameterizedTest
    @CsvSource(value = {"6 2 10 3:1", "1 1 5 5:1", "653 375 1000 1000:347", "161 181 762 375:161"}, delimiter = ':')
    @DisplayName("백준 No1085 테스트")
    void test1085(String a, int expected) {
        // given

        // when
        int solution = No1085.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}