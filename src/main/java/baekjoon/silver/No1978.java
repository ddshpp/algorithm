package baekjoon.silver;

import java.math.BigInteger;
import java.util.Scanner;

public class No1978 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String input = scanner.nextLine();

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(String input) {
        String[] inputs = input.split(" ");

        int result = 0;
        for (String s : inputs) {
            BigInteger bigInteger = new BigInteger(s);
            boolean temp = bigInteger.isProbablePrime(10);

            if (temp) {
                result++;
            }
        }
        return result;
    }
}
