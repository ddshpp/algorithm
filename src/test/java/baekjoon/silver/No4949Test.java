package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class No4949Test {

    @Test
    @DisplayName("백준 No4949 테스트")
    void test4949() {
        // given
        List<String> inputs = new ArrayList<>(Arrays.asList(
                "So when I die (the [first] I will see in (heaven) is a score list).",
                "[ first in ] ( first out ).",
                "Half Moon tonight (At least it is better than no Moon at all].",
                "A rope may form )( a trail in a maze.",
                "Help( I[m being held prisoner in a fortune cookie factory)].",
                "([ (([( [ ] ) ( ) (( ))] )) ]).",
                " ."
        ));
        List<String> expected = new ArrayList<>(Arrays.asList(
                "yes",
                "yes",
                "no",
                "no",
                "no",
                "yes",
                "yes"
        ));

        // when
        List<String> solution = No4949.solution(inputs);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}