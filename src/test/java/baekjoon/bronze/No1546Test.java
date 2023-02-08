package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1546Test {
    @ParameterizedTest
    @CsvSource(value = {"3:40 80 60:75.0", "3:10 20 30:66.666667", "4:1 100 100 100:75.25", "5:1 2 4 8 16:38.75", "2:3 10:65.0", "4:10 20 0 100:32.5", "1:50:100.0", "9:10 20 30 40 50 60 70 80 90:55.55555555555556"}, delimiter = ':')
    @DisplayName("백준 No1546 테스트")
    void test1546(String a, String b, double expected) {
        // given

        // when
        double solution = No1546.solution(b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}