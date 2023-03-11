package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String[] solution = solution(n, arr);
        for (String s : solution) {
            System.out.println(s);
        }

    }

    public static String[] solution(int n, int[] arr) {
        int start1 = 0;
        int end1 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                start1 = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 1) {
                end1 = i;
                break;
            }
        }

        int length1 = end1 - start1 + 1;

        int halfOneEnd = 0;
        int halfTwoStart = 0;
        for (int i = 0; i < (n / 2); i++) {
            if (arr[i] == 1) {
                halfOneEnd = i+1;
            }
        }

        for (int i = n-1 ; i >= (n / 2); i--) {
            if (arr[i] == 1) {
                halfTwoStart = i;
            }
        }

        int length2 = (halfOneEnd) + (n - halfTwoStart);

        String l = "L";
        String r = "R";
        String answer1 ="";
        String answer2 = "";

        if (length1 <= length2) {

            if (start1 < (n-end1-1)) {
                for (int i = 0; i <= end1; i++) {
                    answer1 = (length1+start1) + "";
                    answer2 += l;
                }
            }else {
                for (int i = start1; i < n; i++) {
                    answer1 = (n-start1) + "";
                    answer2 += r;
                }
            }
        }else {

            if (halfOneEnd < halfTwoStart) {

                for (int i = 0; i <= halfOneEnd; i++) {
                    answer2 += l;
                }
                for (int i = halfTwoStart; i <= n; i++) {
                    answer2 += r;
                }
                answer1 = length2 + "";
            }
        }

        String[] result = {answer1, answer2};
        return result;
    }
}
