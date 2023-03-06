package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testNumber = Integer.parseInt(br.readLine());
        String[] result = new String[testNumber];

        for (int i = 0; i < testNumber; i++) {
            result[i] = solution(br.readLine());
        }

        for (String s : result) {
            System.out.println(s);
        }
    }

    public static String solution(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') stack.push(c);
            else if (stack.empty()) return "NO";
            else stack.pop();
        }

        if (stack.empty()) return "YES";
        else return "NO";
    }
}
