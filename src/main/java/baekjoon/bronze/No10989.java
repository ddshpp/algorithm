package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10989 {
    public static void main(String[] args) throws IOException {
        int[] input = new int[10001];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            input[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(int[] input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 10001; i++) {
            while (input[i] > 0) {
                sb.append(i).append('\n');
                input[i]--;
            }
        }
        return String.valueOf(sb);
    }
}
