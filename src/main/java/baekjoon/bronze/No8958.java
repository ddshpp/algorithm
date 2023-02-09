package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No8958 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = Integer.parseInt(scanner.nextLine());

        List<String> input = new ArrayList<>();
        for (int i = 0; i < testNumber; i++) {
            input.add(scanner.nextLine());
        }

        List<Integer> solution = solution(testNumber, input);
        for (int i = 0; i < solution.size(); i++) {
            System.out.println(solution.get(i));
        }
    }

    public static List<Integer> solution(int testNumber, List<String> input) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {
            list.add(0);
        }

        for (int i = 0; i < testNumber; i++) {
            String[] inputScore = input.get(i).split("");
            int tempScore = 1;

            for (int j = 0; j < inputScore.length; j++) {
                if (inputScore[j].equals("O")) {
                    int score = list.get(i);
                    list.set(i, score + tempScore);
                    tempScore++;
                } else {
                    tempScore = 1;
                }
            }
        }

        return list;
    }
}
