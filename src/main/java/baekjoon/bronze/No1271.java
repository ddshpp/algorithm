package baekjoon.bronze;

import java.math.BigInteger;
import java.util.Scanner;

public class No1271 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        BigInteger[] solution = solution(input);
        for (BigInteger bi : solution) {
            System.out.println(bi);
        }
    }

    public static BigInteger[] solution(String input) {
        String[] inputs = input.split(" ");

        BigInteger money = new BigInteger(inputs[0]);
        BigInteger organism = new BigInteger(inputs[1]);

        BigInteger[] result = {money.divide(organism), money.remainder(organism)};
        return result;
    }
}
