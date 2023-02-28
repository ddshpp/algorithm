package baekjoon.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No15552 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int testNumber = Integer.parseInt(br.readLine());
        int[][] input = new int[testNumber][2];

        StringTokenizer st;
        for (int i = 0; i < testNumber; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            input[i][0] = Integer.parseInt(st.nextToken());
            input[i][1] = Integer.parseInt(st.nextToken());
        }

        List<Integer> solution = solution(input, testNumber);
    }

    public static List<Integer> solution(int[][] input, int testNumber) throws IOException {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < testNumber; i++) {
            bw.write(input[i][0] + input[i][1] + "\n");
            list.add(input[i][0] + input[i][1]);
        }

        br.close();
        bw.flush();
        bw.close();
        return list;
    }
}
