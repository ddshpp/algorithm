package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            String input = scanner.nextLine();
            list.add(Integer.parseInt(input));
        }

        List<Integer> solution = solution(list);

        for (int i = 0; i < solution.size(); i++) {
            System.out.println(solution.get(i));
        }
    }

    public static List<Integer> solution(List<Integer> input) {
        List<Integer> list = new ArrayList<>();
        list.add(0, 0);
        list.add(1, 0);
        int max = 0;

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i) > max) {
                list.set(0, input.get(i));
                list.set(1, i + 1);
                max = input.get(i);
            }
        }

        return list;
    }
}
