package baekjoon.bronze;

import java.util.Scanner;

public class No1330 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String answer = solution(input);

        System.out.println(answer);
    }

    public static String solution(String input) {
        String input2[] = input.split(" ");
        int a = Integer.parseInt(input2[0]);
        int b = Integer.parseInt(input2[1]);

        if(a>b) {
            return ">";
        }
        if (a<b) {
            return "<";
        }
        return "==";
    }
}
