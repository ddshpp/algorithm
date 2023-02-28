package baekjoon.bronze;

import java.util.Scanner;

public class No2420 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Long solution = solution(input);
        System.out.println(solution);
    }

    public static Long solution(String input) {
        String[] inputs = input.split(" ");

        Long n = Long.valueOf((inputs[0]));
        Long m = Long.valueOf((inputs[1]));

        return Math.abs(n - m);
    }
}
