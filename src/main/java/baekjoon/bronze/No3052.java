package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> input = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            input.add(Integer.parseInt(scanner.nextLine()));
        }

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(List<Integer> input) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < input.size(); i++) {
            list.add(input.get(i) % 42);
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (list.get(i).equals(list.get(j))) {
                    list.set(j, -1);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != -1) {
                result++;
            }
        }

        return result;
    }
}
