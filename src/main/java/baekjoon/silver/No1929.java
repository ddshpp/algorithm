package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        String solution = solution(a, b);

        System.out.println(solution);
    }

    public static String solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        boolean[] temp = new boolean[b + 1];

        temp[0] = true;
        temp[1] = true;

        for (int i = 2; i < Math.sqrt(temp.length); i++) {
            if (temp[i]) continue;

            for (int j = i * i; j < temp.length; j += i) {
                temp[j] = true;
            }
        }

        for (int i = a; i <= b; i++) {
            if (!temp[i]) {
                sb.append(i).append('\n');
            }
        }

        return String.valueOf(sb);
    }
}
