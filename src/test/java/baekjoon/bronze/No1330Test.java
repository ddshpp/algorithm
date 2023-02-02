package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1330Test {

    @ParameterizedTest
    @CsvSource(value = {"1 2:<", "10 2:>", "5 5:=="}, delimiter = ':')
    @DisplayName("No1330 테스트")
    void test130(String a, String expected) {
        // given

        // when
        String solution = No1330.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}