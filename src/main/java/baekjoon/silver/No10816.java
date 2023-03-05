package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String haveCards = br.readLine();

        int m = Integer.parseInt(br.readLine());
        String newCards = br.readLine();

        int[] solution = solution(n, haveCards, m, newCards);

        //백준제출용
        StringBuilder sb = new StringBuilder();
        for (int i : solution) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }

    public static int[] solution(int n, String haveCards, int m, String newCards) {
        int[] allCard = new int[20000001];

        int maxCard = Integer.MIN_VALUE;
        int minCard = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(haveCards);
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(st.nextToken());
            allCard[a + 10000000]++;
            if (a > maxCard) maxCard = a;
            if (a < minCard) minCard = a;
        }

        int[] result = new int[m];
        st = new StringTokenizer(newCards);

        for (int i = 0; i < m; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (minCard <= a && a <= maxCard) {
                result[i] = allCard[a + 10000000];
            }
        }

        return result;
    }
}
