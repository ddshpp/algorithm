package baekjoon.silver;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No10814Test {

    @Test
    @DisplayName("백준 No10814 테스트")
    void test10814() {
        // given
        int a = 5;
        String[][] arr = {{"21", "Junkyu"}, {"21", "Dohyun"}, {"20", "Sunyoung"}};
        String[][] expected = {{"20", "Sunyoung"}, {"21", "Junkyu"}, {"21", "Dohyun"}};

        // when
        String[][] solution2 = No10814.solution2(arr, a);

        // then
        assertThat(solution2).isEqualTo(expected);
    }
}