package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = solution(input);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<String> solution(String input) {
        int a = Integer.parseInt(input);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            String temp = "";
            for (int j = a - i - 1; j > 0; j--) {
                temp += " ";
            }
            for (int j = 0; j <= i; j++) {
                temp += "*";
            }
            list.add(temp);
        }
        return list;
    }
}
