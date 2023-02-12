package baekjoon.bronze;

import java.util.Scanner;

public class No2231 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(int input) {
        int result = 0;

        for (int i = 0; i < input; i++) {
            int temp = i;
            int sum = 0;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum + i == input) {
                result = i;
                break;
            }
        }

        return result;
    }
}
