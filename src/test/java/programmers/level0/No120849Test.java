package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120849Test {

    @ParameterizedTest
    @CsvSource(value = {"bus:bs", "nice to meet you:nc t mt y"}, delimiter = ':')
    @DisplayName("프로그래머스 No120849 테스트")
    void test120849(String a, String expected) {
        // given

        // when
        String solution = No120849.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}