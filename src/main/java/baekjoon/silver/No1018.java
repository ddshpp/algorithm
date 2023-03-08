package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1018 {
    static boolean[][] chess;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        chess = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            String inputLine = br.readLine();

            for (int j = 0; j < m; j++) {
                if (inputLine.charAt(j) == 'W') chess[i][j] = true;
                else chess[i][j] = false;
            }
        }

        int solution = solution(n, m);
        System.out.println(solution);
    }

    public static int solution(int n, int m) {
        int rangeN = n - 7;
        int rangeM = m - 7;
        int result = 64;

        for (int i = 0; i < rangeN; i++) {
            for (int j = 0; j < rangeM; j++) {
                int value = solution2(i, j);
                if (value < result) {
                    result = value;
                }
            }
        }

        return result;
    }

    public static int solution2(int x, int y) {
        int lastX = x + 8;
        int lastY = y + 8;
        int count = 0;

        boolean check = chess[x][y];

        for (int i = x; i < lastX; i++) {
            for (int j = y; j < lastY; j++) {
                if (chess[i][j] != check) {
                    count++;
                }
                check = (!check);
            }
            check = !check;
        }

        count = Math.min(count, 64 - count);
        return count;
    }
}