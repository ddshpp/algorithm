package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());
        int[] inputs = new int[testNumber];

        for (int i = 0; i < testNumber; i++) {
            inputs[i] = Integer.parseInt(br.readLine());
        }

        List<String> solution = solution(testNumber, inputs);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static List<String> solution(int testNumber, int[] inputs) {
        Stack<Integer> stack = new Stack<>();
        List<String> result = new ArrayList<>();

        int temp = 0;

        for (int i = 0; i < testNumber; i++) {
            int value = inputs[i];

            if (value > temp) {
                for (int j = temp + 1; j <= value; j++) {
                    stack.push(j);
                    result.add("+");
                }
                temp = value;
            }

            else if (stack.peek() != value) {
                List<String> no = new ArrayList<>();
                no.add("NO");
                return no;
            }

            stack.pop();
            result.add("-");
        }

        return result;
    }
}
