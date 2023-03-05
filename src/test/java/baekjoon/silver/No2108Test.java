package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No2108Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("백준 No2108 테스트")
    void test2108(int a) {
        // given
        List<List<Integer>> list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,3,8,-2,2)),
                new ArrayList<>(Arrays.asList(4000)),
                new ArrayList<>(Arrays.asList(-1,-2,-3,-1,-2)),
                new ArrayList<>(Arrays.asList(0,0,1))
        ));
        int[] number = {5,1,5,3};
        int[][] expected = {{2, 2, 1, 10}, {4000, 4000, 4000, 0}, {-2, -2, -1, 2}, {0, 0, 0, 1}};

        // when
        int[] solution = No2108.solution(number[a], list.get(a));

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}