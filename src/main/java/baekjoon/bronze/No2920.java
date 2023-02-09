package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class No2920 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(String input) {
        String[] inputNumbers = input.split(" ");

        String[] ascending = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[] descending = {"8", "7", "6", "5", "4", "3", "2", "1"};

        if (Arrays.equals(inputNumbers, ascending)) {
            return "ascending";
        }
        if (Arrays.equals(inputNumbers, descending)) {
            return "descending";
        }
        return "mixed";
    }
}
