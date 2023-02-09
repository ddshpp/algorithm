package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class No1085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(String input) {
        String[] s = input.split(" ");

        int x = Integer.parseInt(s[0]);
        int y = Integer.parseInt(s[1]);
        int w = Integer.parseInt(s[2]);
        int h = Integer.parseInt(s[3]);

        int[] result = {x, y, (w - x), (h - y)};

        Arrays.sort(result);

        return result[0];
    }
}
