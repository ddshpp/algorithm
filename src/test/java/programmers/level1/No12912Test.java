package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No12912Test {
    @ParameterizedTest
    @CsvSource(value = {"3:5:12", "3:3:3", "5:3:12"}, delimiter = ':')
    @DisplayName("프로그래머스 No12912 테스트")
    void test12912(int a, int b, int expected) {
        // given

        // when
        long solution = No12912.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}