package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        String[][] input = new String[testNumber][2];

        for(int i = 0; i < testNumber; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            input[i][0] = st.nextToken();
            input[i][1] = st.nextToken();
        }
        
        //백준제출용
//        String solution = solution(input, testNumber);
//        System.out.println(solution);

        //내전용
        String[][] strings = solution2(input, testNumber);
    }

    //백준제출용
    public static String solution(String[][] input, int testNumber) {
        Arrays.sort(input, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < testNumber; i++) {
            sb.append(input[i][0]).append(' ').append(input[i][1]).append('\n');
        }
        return String.valueOf(sb);
    }

    //내전용
    public static String[][] solution2(String[][] input, int testNumber) {
        Arrays.sort(input, new Comparator<String[]>() {
            @Override
            public int compare(String[] s1, String[] s2) {
                return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
            }
        });

        return input;
    }
}
