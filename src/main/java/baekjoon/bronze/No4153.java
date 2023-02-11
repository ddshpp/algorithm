package baekjoon.bronze;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class No4153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        while (scanner.hasNext()) {
            input.add(scanner.nextLine());
        }

        List<String> solution = solution(input);
        for (int i = 0; i < solution.size(); i++) {
            System.out.println(solution.get(i));
        }
    }

    public static List<String> solution(List<String> input) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < input.size()-1; i++) {
            List<Integer> list = new ArrayList<>();

            String temp = input.get(i);
            String[] temp2 = temp.split(" ");

            list.add(Integer.parseInt(temp2[0]));
            list.add(Integer.parseInt(temp2[1]));
            list.add(Integer.parseInt(temp2[2]));
            Collections.sort(list);

            int a = list.get(0) * list.get(0);
            int b = list.get(1) * list.get(1);
            int c = list.get(2) * list.get(2);

            if (a + b == c) {
                result.add("right") ;
            }else {
                result.add("wrong") ;
            }
        }
        return result;
    }
}
