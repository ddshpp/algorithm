package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1003 {
    static Integer[][] dp = new Integer[42][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        int[] input = new int[testNumber];
        for (int i = 0; i < testNumber; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        int[][] solution = solution(input, testNumber);

        for (int i = 0; i < testNumber; i++) {
            System.out.println(solution[i][0] + " " + solution[i][1]);
        }
    }

    public static int[][] solution(int[] input, int testNumber) {
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        int[][] result = new int[testNumber][2];

        for (int i = 0; i < testNumber; i++) {
            int[] count = new int[2];

            solution2(input[i]);
            result[i][0] = dp[input[i]][0];
            result[i][1] = dp[input[i]][1];
        }
        return result;
    }

    public static Integer[] solution2(int i) {
        if (dp[i][0] == null || dp[i][1] == null) {
            dp[i][0] = solution2(i - 1)[0] + solution2(i - 2)[0];
            dp[i][1] = solution2(i - 1)[1] + solution2(i - 2)[1];
        }
        return dp[i];
    }
}
