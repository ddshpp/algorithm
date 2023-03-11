package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(br.readLine());

        List<Integer> alpha = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {
            alpha.add(Integer.parseInt(st.nextToken()));
        }

        long solution = solution(n, alpha);
        System.out.println(solution);
    }

    public static long solution(long n, List<Integer> alpha) {
        long x = 0;
        int A = alpha.get(0);
        int B = alpha.get(1);
        int C = alpha.get(2);
        int D = alpha.get(3);
        int E = alpha.get(4);
        int F = alpha.get(5);

        for (int i = 1; i <= n; i++) {
            if (i%A == 0) {
                x = x + i;
            }
            if (i%B == 0) {
                x = x % i;
            }
            if (i%C == 0) {
                x = x & i;
            }
            if (i%D == 0) {
                x = x ^ i;
            }
            if (i%E == 0) {
                x = x | i;
            }
            if (i%F == 0) {
                x = x >> i;
            }
        }

        return x;
    }
}
