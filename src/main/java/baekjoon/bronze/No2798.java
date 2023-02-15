package baekjoon.bronze;

import java.util.Scanner;

public class No2798 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        int solution = solution(input1, input2);
        System.out.println(solution);
    }

    public static int solution(String input1, String input2) {
        String[] input1Split = input1.split(" ");
        int n = Integer.parseInt(input1Split[0]);
        int m = Integer.parseInt(input1Split[1]);

        String[] input2Split = input2.split(" ");
        int[] card = new int[n];
        for (int i = 0; i < n; i++) {
            card[i] = Integer.parseInt(input2Split[i]);
        }

        int max = 0;

        for (int i = 0; i < n - 2; i++) {
            if (card[i] > m) continue;

            for (int j = i + 1; j < n - 1; j++) {
                if (card[i] + card[j] > m) continue;

                for (int k = j + 1; k < n; k++) {
                    int temp = card[i] + card[j] + card[k];
                    if (temp == m) return temp;
                    if (temp > max && temp < m) {
                        max = temp;
                    }
                }
            }
        }
        return max;
    }
}
