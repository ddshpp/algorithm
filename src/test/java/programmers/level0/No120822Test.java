package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120822Test {

    @ParameterizedTest
    @CsvSource(value = {"jaron:noraj", "bread:daerb"}, delimiter = ':')
    @DisplayName("프로그래머스 No120822 테스트")
    void test120822(String a, String expected) {
        // given

        // when
        String solution = No120822.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}