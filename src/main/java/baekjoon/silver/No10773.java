package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int test = Integer.parseInt(br.readLine());

        int[] inputs = new int[test];
        for (int i = 0; i < test; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        int solution = solution(test, inputs);
        System.out.println(solution);
    }

    public static int solution(int test, int[] inputs) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < test; i++) {
            int value = inputs[i];

            if (value == 0) stack.pop();
            else stack.push(value);
        }

        int sum = 0;
        for (int i : stack) sum += i;

        return sum;
    }
}
