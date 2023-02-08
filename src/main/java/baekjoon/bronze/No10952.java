package baekjoon.bronze;

import java.util.Scanner;

public class No10952 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (input.equals("0 0")) {
                break;
            }
            int solution = solution(input);
            System.out.println(solution);
        }
    }

    public static int solution(String input) {
        String[] str = input.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);

        return a + b;
    }
}
