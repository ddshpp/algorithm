package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No27736Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("백준 No27736 테스트")
    void test27736(int a) {
        // given
        long[] arr = {5, 3, 4, 4};
        List<List<Integer>> b = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, -1, 1, 1, -1)),
                new ArrayList<>(Arrays.asList(-1, 1, -1)),
                new ArrayList<>(Arrays.asList(1, 0, -1, 1)),
                new ArrayList<>(Arrays.asList(1, 0, 0, 1))
        ));
        String[] expected = {"APPROVED", "REJECTED", "APPROVED", "INVALID"};

        // when
        String solution = No27736.solution(arr[a], b.get(a));

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}