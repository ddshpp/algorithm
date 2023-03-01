package baekjoon.silver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No11651 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] input = new int[n][2];

        for (int i = 0; i < n; i++) {
            String s = scanner.nextLine();
            String[] s1 = s.split(" ");

            input[i][0] = Integer.parseInt(s1[0]);
            input[i][1] = Integer.parseInt(s1[1]);
        }

        List<String> solution = solution(input);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static List<String> solution(int[][] input) {
        List<String> list = new ArrayList<>();

        Arrays.sort(input, (e1, e2) -> {
            if (e1[1] == e2[1]) {
                return e1[0] - e2[0];
            } else {
                return e1[1] - e2[1];
            }
        });

        for (int[] ints : input) {
            list.add(ints[0] + " " + ints[1]);
        }

        return list;
    }
}
