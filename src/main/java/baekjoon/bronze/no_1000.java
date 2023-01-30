package baekjoon.bronze;

import java.util.Scanner;

public class no_1000 {
    public static void main(String[] args) {

        //숫자입력받기(공백이 있는듯)
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //공백제거
        String[] input2 = input.split(" ");

        int a = Integer.parseInt(input2[0]);
        int b = Integer.parseInt(input2[1]);

        System.out.println(a+b);
    }
}
