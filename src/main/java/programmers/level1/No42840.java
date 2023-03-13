package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class No42840 {
    public static void main(String[] args) {

    }

    public static List<Integer> solution(int[] answers) {
        int[] count = new int[3];
        int[][] supozas = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        for (int i = 0; i < supozas.length; i++) {
            int k = 0;
            for (int j = 0; j < answers.length; j++) {
                if (k == supozas[i].length) {
                    k = 0;
                }
                if (answers[j] == supozas[i][k]) {
                    count[i]++;
                    k++;
                } else {
                    k++;
                }
            }
        }

        if (count[0] > count[1]) {
            count[1] = 0;
        } else if (count[0] < count[1]) {
            count[0] = 0;
        }

        if (count[0] > count[2]) {
            count[2] = 0;
        } else if (count[0] < count[2]) {
            count[0] = 0;
        }

        if (count[1] > count[2]) {
            count[2] = 0;
        } else if (count[1] < count[2]) {
            count[1] = 0;
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (count[i] != 0) {
                list.add(i+1);
            }
        }

        return list;
    }
}
