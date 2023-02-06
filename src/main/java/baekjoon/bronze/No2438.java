package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2438 {
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
        String a = "*";
        for (int i = 0; i < input; i++) {
            list.add(i, a);
            a += "*";
        }
        return list;
    }
}
