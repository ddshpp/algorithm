package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No2675 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = Integer.parseInt(scanner.nextLine());

        List<String> input = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {
            input.add(scanner.nextLine());
        }

        List<String> solution = solution(testNumber, input);
        for (int i = 0; i < testNumber; i++) {
            System.out.println(solution.get(i));
        }
    }

    public static List<String> solution(int testNumber, List<String> input) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {

            String[] str = input.get(i).split("");

            int repetitionsNumber = Integer.parseInt(str[0]);
            String temp = "";

            for (int j = 2; j < str.length; j++) {
                temp += str[j].repeat(repetitionsNumber);
            }

            list.add(temp);
        }

        return list;
    }
}
