package baekjoon.gold;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class No1038 {
    static ArrayList<Long> list;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        list = new ArrayList<>();

        input(input);
    }

    public static long input(int input) {
        if (input <= 10) {
            System.out.println(input);
            return input;
        } else if (input > 1022) {
            System.out.println("-1");
            return -1;
        } else {
            for (int i = 0; i < 10; i++) {
                solution(i, 1);
            }
            Collections.sort(list);
            System.out.println(list.get(input));
            return list.get(input);
        }
    }

    public static void solution(long num, int depth) {
        if (depth > 10) {
            return;
        }
        list.add(num);

        for (int i = 0; i < num % 10; i++) {
            solution((num * 10) + i, depth + 1);
        }
    }
}
