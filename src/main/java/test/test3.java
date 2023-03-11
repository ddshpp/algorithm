package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testNumber = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] inputs = new int[testNumber];
        for (int i = 0; i < testNumber; i++) {
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        String solution = solution(testNumber, inputs);
        System.out.println(solution);
    }

    public static String solution(int testNumber, int[] inputs) {

        int half = testNumber / 2;
        if (testNumber % 2 == 1) {
            half++;
        }

        return "";
    }
}
