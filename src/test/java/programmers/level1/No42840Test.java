package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No42840Test {
    @ParameterizedTest
    @ValueSource(ints = {0,1})
    @DisplayName("프로그래머스 No42840 테스트")
    void test42840(int a) {
        // given
        int[][] answer = {
                {1, 2, 3, 4, 5},
                {1, 3, 2, 4, 2}
        };
        List<List<Integer>> expected = new ArrayList<>((Arrays.asList(
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(Arrays.asList(1,2,3))
        )));

        // when
        List<Integer> solution = No42840.solution(answer[a]);

        // then
        assertThat(solution).isEqualTo(expected.get(a));
    }
}