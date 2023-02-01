package baekjoon.bronze;

import java.util.Scanner;

public class No1152 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int answer = solution(input);

        System.out.println(answer);
    }

    public static int solution(String input) {
        input = input.trim();
        if (input.isEmpty()) {
            return 0;
        }

        String[] input2 = input.split(" ");
        return input2.length;
    }
}
