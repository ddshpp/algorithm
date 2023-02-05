package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120830Test {

    @ParameterizedTest
    @CsvSource(value = {"10:3:124000", "64:6:768000"}, delimiter = ':')
    @DisplayName("프로그래머스 No120830 테스트")
    void test120830(int a, int b, int expected) {
        // given

        // when
        int solution = No120830.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}