package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120825Test {

    @ParameterizedTest
    @CsvSource(value = {"hello:3:hhheeellllllooo"}, delimiter = ':')
    @DisplayName("프로그래머스 No120825 테스트")
    void test120825(String a, int b, String expected) {
        // given

        // when
        String solution = No120825.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}