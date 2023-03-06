package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No9012Test {

    @ParameterizedTest
    @ValueSource(ints = {0,1,2,3,4,5})
    @DisplayName("백준 No9012 테스트")
    void test9012(int a) {
        // given
        String[] arr = {"(())())", "(((()())()", "(()())((()))", "((()()(()))(((())))()", "()()()()(()()())()", "(()((())()("};
        String[] expected = {"NO","NO","YES","NO","YES","NO"};

        // when
        String solution = No9012.solution(arr[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}