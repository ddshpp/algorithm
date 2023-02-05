package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1152Test {

    @ParameterizedTest
    @CsvSource(value = {"The Curious Case of Benjamin Button:6", "The first character is a blank:6", "The last character is a blank:6"}, delimiter = ':')
    @DisplayName("백준 No1152 테스트")
    void test1152(String a, int expected) {
        // given

        // when
        int solution = No1152.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }

    @Test
    @DisplayName("백준 No1152 테스트2")
    void test1152() {
        // given
        String a = "";
        int expected = 0;

        // when
        int solution = No1152.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}