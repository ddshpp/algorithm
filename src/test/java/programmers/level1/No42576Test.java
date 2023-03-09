package programmers.level1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class No42576Test {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    @DisplayName("프로그래머스 No42576 테스트")
    void test42576(int a) {
        // given
        String[][] participant = {{"leo", "kiki", "eden"}, {"marina", "josipa", "nikola", "vinko", "filipa"}, {"mislav", "stanko", "mislav", "ana"}};
        String[][] completion = {{"eden", "kiki"}, {"josipa", "filipa", "marina", "nikola"}, {"stanko", "ana", "mislav"}};
        String[] expected = {"leo", "vinko", "mislav"};

        // when
        String solution = No42576.solution(participant[a], completion[a]);

        // then
        assertThat(solution).isEqualTo(expected[a]);
    }
}