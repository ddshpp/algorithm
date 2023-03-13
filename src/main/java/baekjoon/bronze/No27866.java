package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int inputNumber = Integer.parseInt(br.readLine());

        char solution = solution(input, inputNumber);
        System.out.println(solution);
    }

    public static char solution(String input, int inputNumber) {
        return input.charAt(inputNumber - 1);
    }
}
