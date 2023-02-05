package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120906Test {

    @ParameterizedTest
    @CsvSource(value = {"1234:10", "930211:16"}, delimiter = ':')
    @DisplayName("프로그래머스 No120906 테스트")
    void test120906(int a, int expected) {
        // given

        // when
        int solution = No120906.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}