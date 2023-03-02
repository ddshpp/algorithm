package baekjoon.silver;

import java.util.*;

public class No7568 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testNumber = Integer.parseInt(scanner.nextLine());

        String[] input = new String[testNumber];

        for (int i = 0; i < testNumber; i++) {
            input[i] = scanner.nextLine();
        }
        
        //백준제출용
//        String solution = solution(input, testNumber);
//        System.out.println(solution);
        int[] solution = solution(input, testNumber);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[] input, int testNumber) {
        int[][] inputs = new int[testNumber][2];
        for (int i = 0; i < testNumber; i++) {
            String[] s = input[i].split(" ");
            inputs[i][0] = Integer.parseInt(s[0]);
            inputs[i][1] = Integer.parseInt(s[1]);
        }

        int[] temp = new int[testNumber];
        
        //백준제출용
//        String result = "";
        for (int i = 0; i < testNumber; i++) {
            int rank = 1;

            for (int j = 0; j < testNumber; j++) {
                if (i == j) continue;
                if (inputs[i][0] < inputs[j][0] && inputs[i][1] < inputs[j][1]) {
                    rank++;
                }
            }
            temp[i] = rank;
            //백준제출용
//            result += rank + " ";
        }

//        return result;
        return temp;
    }
}
