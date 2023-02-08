package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        List<String> listStr = new ArrayList<>();
        for (int i = 0; i < input; i++) {
            listStr.add(scanner.nextLine());
        }

        List<Integer> list = solution(listStr);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static List<Integer> solution(List<String> listStr) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < listStr.size(); i++) {
            String[] s = listStr.get(i).split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            list.add(a + b);
        }
        return list;
    }
}
