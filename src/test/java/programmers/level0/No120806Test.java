package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120806Test {
    @ParameterizedTest
    @CsvSource(value = {"3:2:1500", "7:3:2333", "1:16:62"}, delimiter = ':')
    @DisplayName("프로그래머스 No120806 테스트")
    void test120806(int a, int b, int expected) {
        // given

        // when
        int solution = No120806.solution(a, b);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}