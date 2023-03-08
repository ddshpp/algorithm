package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No18111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int haveBlocks = Integer.parseInt(st.nextToken());

        int[][] buildingSite = new int[n][m];

        for (int i = 0; i < n; i++) {
            String heightInput = br.readLine();
            st = new StringTokenizer(heightInput);

            for (int j = 0; j < m; j++) {
                buildingSite[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        String solution = solution(n, m, buildingSite, haveBlocks);
        System.out.println(solution);
    }

    public static String solution(int n, int m, int[][] buildingSite, int haveBlocks) {
        int maxHeight = 0;
        int minHeight = 256;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int tempHeight = buildingSite[i][j];

                if (tempHeight > maxHeight) {
                    maxHeight = tempHeight;
                }
                if (tempHeight < minHeight) {
                    minHeight = tempHeight;
                }
            }
        }

        int bestTime = 100000000;
        int bestHigh = 0;

        for (int i = minHeight; i <= maxHeight; i++) {
            int block = haveBlocks;
            int time = 0;

            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    int value = buildingSite[j][k];

                    if (value > i) {
                        time += (value - i) * 2;
                        block += (value - i);
                    }
                    if (value < i) {
                        time += (i - value);
                        block -= (i - value);
                    }
                }
            }

            if (block < 0) {
                break;
            }

            if (time <= bestTime) {
                bestTime = time;
                bestHigh = i;
            }
        }

        return bestTime + " " + bestHigh;
    }
}
