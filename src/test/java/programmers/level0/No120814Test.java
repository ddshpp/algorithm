package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120814Test {
    @ParameterizedTest
    @CsvSource(value = {"7:1","1:1","15:3"}, delimiter = ':')
    @DisplayName("프로그래머스 No120814 테스트")
    void test120814(int a, int expected) {
        // given

        // when
        int solution = No120814.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}