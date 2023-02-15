package baekjoon.bronze;

import java.util.Scanner;

public class No11382 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(String input) {
        String[] s = input.split(" ");
        double sum = 0.0;

        for (String s1 : s) {
            sum += Double.parseDouble(s1);
        }

        if (sum == (long) sum) {
            return String.valueOf((long) sum);
        } else {
            return String.valueOf(sum);
        }
    }
}
