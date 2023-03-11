package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2440 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        String star = "*";
        int temp = input;

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < temp; j++) {
                System.out.print(star);
            }
            temp--;
            System.out.println();
        }
    }
}
