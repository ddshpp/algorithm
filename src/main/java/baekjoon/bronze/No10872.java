package baekjoon.bronze;

import java.util.Scanner;

public class No10872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(int input) {
        if (input == 0 || input == 1) return 1;

        return input * solution(input - 1);
    }
}
