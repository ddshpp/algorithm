package baekjoon.silver;

import java.util.LinkedList;
import java.util.Scanner;

public class No11866 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(String input) {
        String[] inputs = input.split(" ");
        int n = Integer.parseInt(inputs[0]);
        int k = Integer.parseInt(inputs[1]);

        LinkedList<Integer> list = new LinkedList<Integer>();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');

        int index = 0;

        while (list.size() > 1) {
            index = (index + (k - 1)) % list.size();
            sb.append(list.remove(index)).append(", ");
        }

        sb.append(list.remove()).append('>');

        return String.valueOf(sb);
    }
}
