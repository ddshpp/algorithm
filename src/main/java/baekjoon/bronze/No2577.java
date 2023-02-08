package baekjoon.bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class No2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        List<Integer> solution = solution(a, b, c);

        for (int i = 0; i < 10; i++) {
            System.out.println(solution.get(i));
        }
    }

    public static List<Integer> solution(int a, int b, int c) {
        List<Integer> list = new ArrayList<>(Arrays.asList(0,0,0,0,0,0,0,0,0,0));

        int temp1 = a*b*c;
        String temp2 = temp1 + "";

        String[] split = temp2.split("");
        for (int i = 0; i < split.length; i++) {
            int j = Integer.parseInt(split[i]);
            int k = list.get(j);
            list.set(j, k+1);
        }

        return list;
    }
}
