package programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No42748 {
    public static void main(String[] args) {

    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] result = new int[commands.length];

        for (int m = 0; m < commands.length; m++) {
            int i = commands[m][0];
            int j = commands[m][1];
            int k = commands[m][2];

            List<Integer> list = new ArrayList<>();

            for (int l = (i-1); l < j; l++) {
                list.add(array[l]);
            }
            Collections.sort(list);

            result[m] = list.get(k-1);
        }

        return result;
    }
}
