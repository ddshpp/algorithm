package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No2908Test {

    @ParameterizedTest
    @CsvSource(value = {"734 893:437", "221 231:132", "839 237:938"}, delimiter = ':')
    @DisplayName("백준 No2908 테스트")
    void test2908(String a, int expected) {
        // given

        // when
        int solution = No2908.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}