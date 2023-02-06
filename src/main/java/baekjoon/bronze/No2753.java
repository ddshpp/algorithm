package baekjoon.bronze;

import java.util.Scanner;

public class No2753 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(solution(input));
    }

    public static int solution(int input) {
        if (input % 4 == 0) {
            if (input % 100 != 0 || input % 400 == 0) {
                return 1;
            }
            return 0;
        }
        return 0;
    }
}
