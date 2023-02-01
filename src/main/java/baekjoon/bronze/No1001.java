package baekjoon.bronze;

import java.util.Scanner;

public class No1001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] input2 = input.split(" ");

        int a = Integer.parseInt(input2[0]);
        int b = Integer.parseInt(input2[1]);

        int answer = solution(a, b);
        System.out.println(answer);
    }

    public static int solution(int a, int b) {
        return a - b;
    }
}
