package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No1874Test {

    @ParameterizedTest
    @ValueSource(ints = {0,1})
    @DisplayName("백준 No1874 테스트")
    void test1874(int a) {
        // given
        int[] aa = {8, 5};
        int[][] inputs = {{4, 3, 6, 8, 7, 5, 2, 1}, {1, 2, 5, 3, 4}};
        List<List<String>> expected = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList("+","+","+","+","-","-","+","+","-","+","+","-","-","-","-","-")),
                new ArrayList<>(Arrays.asList("NO"))
        ));

        // when
        List<String> solution = No1874.solution(aa[a], inputs[a]);

        // then
        assertThat(solution).isEqualTo(expected.get(a));
    }
}