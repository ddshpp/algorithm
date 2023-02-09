package baekjoon.bronze;

import java.util.Scanner;

public class No2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String solution = solution(input);
        System.out.println(solution);
    }

    public static String solution(String input) {
        String[] inputTime = input.split(" ");

        int hour = Integer.parseInt(inputTime[0]);
        int minute = Integer.parseInt(inputTime[1]);

        String result = "";

        if (minute >= 45) {
            minute -= 45;
            result = hour + " " + minute;
            return result;
        }
        if (hour > 0) {
            hour--;
            minute = 60 - (45 - minute);
            result = hour + " " + minute;
            return result;
        } else {
            hour = 23;
            minute = 60 - (45 - minute);
            result = hour + " " + minute;
            return result;
        }
    }
}
