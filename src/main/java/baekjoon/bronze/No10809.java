package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10809 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Integer> list = solution(input);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> solution(String input) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 26; i++) {
            list.add(-1);
        }
        for (int i = input.length() - 1; i >= 0; i--) {
            int a = input.charAt(i) - 'a';
            list.set(a, i);
        }

        return list;
    }
}
