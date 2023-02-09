package baekjoon.bronze;

import java.util.Scanner;

public class No2908 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(String input) {
        String[] numbers = input.split(" ");
        StringBuilder sb1 = new StringBuilder(numbers[0]);
        StringBuilder sb2 = new StringBuilder(numbers[1]);

        String reverseNumber0 = sb1.reverse().toString();
        String reverseNumber1 = sb2.reverse().toString();

        int reverseNumber0Int = Integer.parseInt(reverseNumber0);
        int reverseNumber1Int = Integer.parseInt(reverseNumber1);

        if (reverseNumber0Int > reverseNumber1Int) {
            return reverseNumber0Int;
        }
        if (reverseNumber0Int < reverseNumber1Int) {
            return reverseNumber1Int;
        }
        return -1;
    }
}
