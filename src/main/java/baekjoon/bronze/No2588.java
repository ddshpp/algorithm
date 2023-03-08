package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int firstNumber = Integer.parseInt(br.readLine());
        String secondNumber = br.readLine();

        List<Integer> solution = solution(firstNumber, secondNumber);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static List<Integer> solution(int firstNumber, String secondNumber) {
        List<Integer> result = new ArrayList<>();

        int length = secondNumber.length() - 1;

        for (int i = length; i >= 0; i--) {
            int temp = secondNumber.charAt(i) - '0';
            result.add(firstNumber*temp);
        }
        result.add(firstNumber*Integer.parseInt(secondNumber));

        return result;
    }
}
