package baekjoon.bronze;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class No10871 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> input = getInput();
        String solution = solution(input);

        System.out.println(solution);
    }

    public static List<Integer> getInput() {
        String inputStartNumber = scanner.nextLine();
        String[] input = inputStartNumber.split(" ");
        int N = Integer.parseInt(input[0]);
        int X = Integer.parseInt(input[1]);

        if (N < 0 || N > 10000) {
            System.out.println("다시 입력하십시오");
            getInput();
        }

        String inputArrayNumber = scanner.nextLine();
        String[] input2 = inputArrayNumber.split(" ");

        if (input2.length != N) {
            System.out.println("다시 입력하십시오");
            getInput();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < N + 2; i++) {
            if (i < N) {
                list.add(Integer.parseInt(input2[i]));
                continue;
            }
            if (i == N) {
                list.add(N);
                continue;
            }
            list.add(X);
        }
        return list;
    }

    public static String solution(List<Integer> list) {
        String result = "";

        int size = list.size();
        int X = list.get(size - 1);
        int N = list.get(size - 2);

        for (int i = 0; i < N; i++) {
            if (list.get(i) < X) {
                result += list.get(i) + "" + " ";
            }
        }
        result = result.strip();

        return result;
    }
}
