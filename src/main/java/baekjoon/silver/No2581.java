package baekjoon.silver;

import java.math.BigInteger;
import java.util.Scanner;

public class No2581 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int[] input = {m, n};

        int[] solution = solution(input);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int[] input) {
        int[] result = new int[2];
        boolean temp = true;

        for (int i = input[0]; i <= input[1]; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            boolean probablePrime = bigInteger.isProbablePrime(10);

            if (probablePrime) {
                result[0] += i;
            }
            if (temp && probablePrime) {
                result[1] += i;
                temp = false;
            }
        }

        if (result[0] == 0) {
            return new int[]{-1};
        }

        return result;
    }
}
