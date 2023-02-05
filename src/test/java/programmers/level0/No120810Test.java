package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120810Test {
    @ParameterizedTest
    @CsvSource(value = {"3:2:1", "10:5:0"}, delimiter = ':')
    @DisplayName("프로그래머스 No120810 테스트")
    void test120810(int a, int b, int expected) {
        // given

        // when
        int solution = No120810.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}