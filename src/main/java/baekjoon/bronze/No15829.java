package baekjoon.bronze;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No15829 {

    static final int M = 1234567891;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputLength = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        long solution = solution(inputLength, input);
        System.out.println(solution);
    }

    public static long solution(int inputLength, String input) {
        Map<Character, Integer> hashMap = new HashMap<>();

        char a = 'a';
        char z = 'z';
        Integer b = 1;

        for (int i = a; i <= z; i++) {
            hashMap.put((char) i, b);
            b++;
        }

        long result = 0;
        long pow = 1;

        for (int i = 0; i < inputLength; i++) {
            char c = input.charAt(i);
            Integer temp = hashMap.get(c);

            result += temp * pow % M;
            pow = pow * 31 % M;
        }

        return result % M;
    }
}
