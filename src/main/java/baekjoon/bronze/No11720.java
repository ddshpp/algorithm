package baekjoon.bronze;

import java.util.Scanner;

public class No11720 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        int solution = solution(input2);
        System.out.println(solution);
    }

    public static int solution(String input2) {
        String[] split = input2.split("");
        int a = 0;

        for (int i = 0; i < split.length; i++) {
            int temp = Integer.parseInt(split[i]);
            a += temp;
        }
        return a;
    }
}
