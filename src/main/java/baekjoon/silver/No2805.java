package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String firstInput = br.readLine();
        String[] firstInputs = firstInput.split(" ");
        int treeCount = Integer.parseInt(firstInputs[0]);
        int takeTree = Integer.parseInt(firstInputs[1]);

        int[] trees = new int[treeCount];

        String secondInput = br.readLine();
        String[] secondInputs = secondInput.split(" ");

        int max = 0;
        for (int i = 0; i < treeCount; i++) {
            trees[i] = Integer.parseInt(secondInputs[i]);
            if (trees[i] > max) {
                max = trees[i];
            }
        }

        long solution = solution(trees, treeCount, takeTree, max);
        System.out.println(solution);
    }

    public static long solution(int[] trees, int treeCount, int takeTree, int max) {
        long half = (max / 2);
        long success = 0;
        long fail = 0;

        while ((fail - success) != 1) {
            long sum = 0;

            for (int i = 0; i < treeCount; i++) {
                if ((trees[i] - max) > 0) {
                    sum += (trees[i] - max);
                }
            }

            if (sum >= takeTree) {
                success = max;
                max += half;
                half = (half + 1) / 2;
            } else {
                fail = max;
                max -= half;
                half = (half + 1) / 2;
            }
        }

        return success;
    }
}
