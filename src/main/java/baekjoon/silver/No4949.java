package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class No4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input;
        List<String> inputs = new ArrayList<>();

        while (true) {
            input = br.readLine();
            if (input.equals(".")) break;

            inputs.add(input);
        }

        List<String> solution = solution(inputs);
        for (String s : solution) {
            System.out.println(s);
        }
    }

    public static List<String> solution(List<String> inputs) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < inputs.size(); i++) {
            String temp = inputs.get(i);

            Stack<Character> stack = new Stack<>();
            int temp2 = 0;

            for (int j = 0; j <temp.length(); j++) {
                char c = temp.charAt(j);

                if(c == '(' || c == '[') {
                    stack.push(c);
                }

                else if(c == ')') {
                    if(stack.empty() || stack.peek() != '(') {
                        temp2 = -1;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }

                else if(c == ']') {
                    if(stack.empty() || stack.peek() != '[') {
                        temp2 = -1;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            if (temp2 == -1) {
                result.add("no");
                continue;
            }

            if(stack.empty()) {
                result.add("yes");
            }
            else {
                result.add("no");
            }
        }

        return result;
    }
}
