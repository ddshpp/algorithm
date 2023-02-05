package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120820Test {

    @ParameterizedTest
    @CsvSource(value = {"40:1983", "23:2000"}, delimiter = ':')
    @DisplayName("프로그래머스 No120820 테스트")
    void test120820(int a, int expected) {
        // given

        // when
        int solution = No120820.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}