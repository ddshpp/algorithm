package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No87389Test {

    @ParameterizedTest
    @CsvSource(value = {"10:3", "12:11"}, delimiter = ':')
    @DisplayName("프로그래머스 No87389 테스트")
    void test87389(int a, int expected) {
        // given

        // when
        int solution = No87389.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}