package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arrN = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arrN[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] arrM = new int[m];
        for (int i = 0; i < m; i++) {
            arrM[i] = Integer.parseInt(st.nextToken());
        }

        //백준제출버전
//        String solution = solution(arrN, arrM, m);
//        System.out.println(solution);

        //내버전
        int[] solution2 = solution2(arrN, arrM, m);
        for (int i : solution2) {
            System.out.println(i);
        }
    }

    //백준제출버전
    public static String solution(int[] arrN, int[] arrM, int m) {
        String newline = System.lineSeparator();

        Arrays.sort(arrN);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(arrN, arrM[i]) >= 0) {
                sb.append(1).append(newline);
            } else {
                sb.append(0).append(newline);
            }
        }

        return String.valueOf(sb);
    }

    //내버전
    public static int[] solution2(int[] arrN, int[] arrM, int m) {
        Arrays.sort(arrN);

        for (int i = 0; i < m; i++) {
            if (Arrays.binarySearch(arrN, arrM[i]) >= 0) {
                arrM[i] = 1;
            } else {
                arrM[i] = 0;
            }
        }

        return arrM;
    }
}
