package baekjoon.bronze;

import java.util.Scanner;

public class No2609 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] solution = solution(input);

        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(String input) {
        int[] result = new int[2];

        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);
        int temp = a * b;

        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }

        result[0] = a;
        result[1] = temp / a;

        return result;
    }
}
