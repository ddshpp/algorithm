package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10869 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        List<Integer> list = solution(input);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> solution(String input) {
        String[] input2 = input.split(" ");
        int a = Integer.parseInt(input2[0]);
        int b = Integer.parseInt(input2[1]);

        List<Integer> list = new ArrayList<>();
        list.add(a + b);
        list.add(a - b);
        list.add(a * b);
        list.add(a / b);
        list.add(a % b);

        return list;
    }
}
