package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120829Test {

    @ParameterizedTest
    @CsvSource(value = {"70:1", "91:3", "180:4"}, delimiter = ':')
    @DisplayName("프로그래머스 No120829 테스트")
    void test120829(int a, int expected) {
        // given

        // when
        int solution = No120829.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}