package baekjoon.bronze;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class No10989Test {

    @Test
    @DisplayName("백준 No10989 테스트")
    void test10989() {
        // given
        int[] a = new int[10001];
        int[] temp = {5, 2, 3, 1, 4, 2, 3, 5, 1, 7};
        for (int i = 0; i < temp.length; i++) {
            a[temp[i]]++;
        }
        String expected = "1\n1\n2\n2\n3\n3\n4\n5\n5\n7\n";

        // when
        String solution = No10989.solution(a);

        // then
        assertThat(solution).isEqualTo(expected);
    }
}