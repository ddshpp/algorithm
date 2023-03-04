package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10039 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> input = new ArrayList<>();
        while (scanner.hasNext()) {
            int a = Integer.parseInt(scanner.nextLine());
            input.add(a);
        }

        int solution = solution(input);
        System.out.println(solution);
    }

    public static int solution(List<Integer> input) {
        int temp = 0;
        int count = 0;

        for (int i = 0; i < input.size(); i++) {
            int a = input.get(i);

            if (a>40) {
                temp += a;
                count++;
            }else {
                temp += 40;
                count++;
            }
        }

        return temp/count;
    }
}
