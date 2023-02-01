package baekjoon.bronze;

import java.util.Scanner;

public class no_1152 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.trim();

        String[] input2 = input.split(" ");

        if (input.isEmpty() == true) {
            System.out.println(0);
        } else {
            System.out.println(input2.length);
        }
    }
}
