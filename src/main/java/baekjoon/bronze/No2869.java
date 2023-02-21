package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class No2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(String input) {
        String[] inputs = input.split(" ");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);
        int V = Integer.parseInt(inputs[2]);

        int day = (V-B) / (A - B) ;
        if ((V-B)%(A-B) != 0) {
            day++;
        }

        return day;
    }
}
