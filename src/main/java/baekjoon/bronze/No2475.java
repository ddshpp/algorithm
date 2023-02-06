package baekjoon.bronze;

import java.util.Scanner;

public class No2475 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(solution(input));
    }

    public static int solution(String input) {
        String[] input2 = input.split(" ");
        int result = 0;

        for (int i = 0; i < input2.length; i++) {
            int temp = Integer.parseInt(input2[i]);
            result += temp * temp;
        }

        return result % 10;
    }
}
