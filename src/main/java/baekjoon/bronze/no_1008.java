package baekjoon.bronze;

import java.util.Scanner;
public class no_1008 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] input2 = input.split(" ");

        double a = Double.parseDouble(input2[0]);
        double b = Double.parseDouble(input2[1]);

        System.out.println(a / b);
    }
}
