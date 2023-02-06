package baekjoon.bronze;

import java.util.Scanner;

public class No9498 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        System.out.println(solution(input));
    }

    public static String solution(int input) {
        switch (input / 10) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }
}
