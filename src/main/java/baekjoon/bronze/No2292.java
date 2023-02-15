package baekjoon.bronze;

import java.util.Scanner;

public class No2292 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(int input) {
        if (input == 1) {
            return 1;
        }

        int temp = 6;
        int distance = 1;
        int lastNum = 1;

        while (lastNum < input) {
            lastNum += temp;
            temp += 6;
            distance++;
        }

        return distance;
    }
}
