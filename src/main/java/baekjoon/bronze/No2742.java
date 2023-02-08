package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2742 {
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
        int a = Integer.parseInt(input);

        for (int i = a; i > 0; i--) {
            list.add(i);
        }

        return list;
    }
}
