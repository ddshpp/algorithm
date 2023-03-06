package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int solution = solution(n);
        System.out.println(solution);
    }

    public static int solution(int n) {
        if (n == 4 || n == 7) return -1;

        int tempA = n / 5;
        int tempB = n % 5;
        int tempC = tempB % 2;

        if (tempB == 0) return tempA;
        if (tempC != 0) return (tempA + 1);
        else return (tempA + 2);
    }
}
