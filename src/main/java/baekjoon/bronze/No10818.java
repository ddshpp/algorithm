package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class No10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        String solution = solution(number, input);
        System.out.println(solution);
    }

    public static String solution(int number, String input) {
        String[] temp = input.split(" ");
        int[] temp2 = new int[temp.length];

        for (int i = 0; i < number; i++) {
            temp2[i] = Integer.parseInt(temp[i]);
        }
        Arrays.sort(temp2);

        return temp2[0] + " " + temp2[temp2.length - 1];
    }
}
