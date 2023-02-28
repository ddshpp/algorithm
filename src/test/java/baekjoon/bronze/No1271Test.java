package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThat;

class No1271Test {

    @Test
    @DisplayName("백준 No1271 테스트")
    void test1271() {
        // given
        String a = "1000 100";
        BigInteger[] expected = {BigInteger.valueOf(10), BigInteger.valueOf(0)};

        // when
        BigInteger[] solution = No1271.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}