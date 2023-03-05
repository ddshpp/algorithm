package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int solution = solution(n);
        System.out.println(solution);
    }

    public static int solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;

        int temp = 1;
        int check = 1;

        for (int i = 1; i < n; i++) {
            arr[i] = temp;
            temp--;
            if (temp == 0) {
                temp = check * 2;
                check = temp;
            }
        }

        int result = n - arr[n - 1] + 1;

        return result;
    }
}
