package baekjoon.bronze;

import java.util.Scanner;

public class No2438 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        solution(input);
    }

    public static void solution(int input) {
        for (int i = 0; i < input; i++) {
            for (int j = 0; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
