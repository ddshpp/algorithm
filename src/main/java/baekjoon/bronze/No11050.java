package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int solution = solution(a, b);
        System.out.println(solution);
    }

    public static int solution(int a, int b) {
        return factorial(a) / (factorial(a - b) * factorial(b));
    }

    public static int factorial(int i) {
        if (i <=0) {
            return 1;
        }
        return i*factorial(i-1);
    }
}
