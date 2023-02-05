package programmers.level0;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class No120893Test {

    @ParameterizedTest
    @CsvSource(value = {"cccCCC:CCCccc", "abCdEfghIJ:ABcDeFGHij"}, delimiter = ':')
    @DisplayName("프로그래머스 No120893 테스트")
    void test120893(String a, String expected) {
        // given

        // when
        String solution = No120893.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}