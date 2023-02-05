package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No1157Test {
    @ParameterizedTest
    @CsvSource(value = {"Mississipi:?", "zZa:Z", "z:Z", "baaa:A"}, delimiter = ':')
    @DisplayName("백준 No1157 테스트")
    void test1157(String a, String expected) {
        // given

        // when
        String solution = No1157.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
    //이랬을떄 오류 발생함
}