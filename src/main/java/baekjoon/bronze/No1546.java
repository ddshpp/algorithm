package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String input2 = scanner.nextLine();

        double solution = solution(input2);
        System.out.println(solution);
    }

    public static double solution(String input2) {
        List<Double> list = new ArrayList<>();

        String[] str = input2.split(" ");
        double max = 0;
        double sum = 0;

        for (int i = 0; i < str.length; i++) {
            list.add(Double.parseDouble(str[i]));
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            double temp = list.get(i) / max * 100;
            list.set(i, temp);
            sum += list.get(i);
        }

        return sum / list.size();
    }
}
