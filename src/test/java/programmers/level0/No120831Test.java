package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120831Test {

    @ParameterizedTest
    @CsvSource(value = {"10:30", "4:6"}, delimiter = ':')
    @DisplayName("프로그래머스 No120831 테스트")
    void test120831(int a, int expected) {
        // given

        // when
        int solution = No120831.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}