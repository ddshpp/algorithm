package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

class No1181Test {

    @Test
    @DisplayName("백준 No1181 테스트")
    void test1181() {
        // given
        Set<String> a = new HashSet<>(Arrays.asList("but", "i", "wont", "hesitate", "no", "more", "no", "more", "it", "cannot", "wait", "im", "yours"));
        List<String> expected = new ArrayList<>(Arrays.asList("i", "im", "it", "no", "but", "more", "wait", "wont", "yours", "cannot", "hesitate"));

        // when
        List<String> solution = No1181.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}