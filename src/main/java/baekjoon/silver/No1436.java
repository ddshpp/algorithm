package baekjoon.silver;

import java.util.Scanner;

public class No1436 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(int input) {
        int temp = 666;
        int count = 1;

        while (count != input) {
            temp++;
            if (String.valueOf(temp).contains("666")) {
                count++;
            }
        }
        return temp;
    }
}
