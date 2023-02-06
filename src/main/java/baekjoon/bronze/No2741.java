package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2741 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        List<Integer> list = solution(input);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> solution(int input) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= input; i++) {
            list.add(i);
        }
        return list;
    }
}
