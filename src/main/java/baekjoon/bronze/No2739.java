package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2739 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        List<String> list = solution(input);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> solution(int input) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            String a = input + " * " + i + " = " + input * i;
            list.add(a);
        }
        return list;
    }
}
