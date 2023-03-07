package baekjoon.bronze;

import java.util.Scanner;

public class No2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        String secondNumber = scanner.nextLine();

        int[] arr = new int[4];

        for (int i = 0; i < 3; i++) {
            int c = secondNumber.charAt(2 - i) - '0';
            arr[i] = firstNumber * c ;
        }

        arr[3] = firstNumber * Integer.parseInt(secondNumber);

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
