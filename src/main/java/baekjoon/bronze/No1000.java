package baekjoon.bronze;

import java.util.Scanner;

public class No1000 {
    public static void main(String[] args) {

        //숫자입력받기(공백이 있는듯)
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //공백제거
        String[] input2 = input.split(" ");

        int a = Integer.parseInt(input2[0]);
        int b = Integer.parseInt(input2[1]);

        int answer = solution(a, b);

        System.out.println(answer);
    }

    public static int solution(int a, int b) {
        return a + b;
    }
}
