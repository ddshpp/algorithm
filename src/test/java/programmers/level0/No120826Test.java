package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120826Test {
    @ParameterizedTest
    @CsvSource(value = {"abcdef:f:abcde", "BCBdbe:B:Cdbe"}, delimiter = ':')
    @DisplayName("프로그래머스 No120826 테스트")
    void test120826(String a, String b, String expected) {
        // given

        // when
        String solution = No120826.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}