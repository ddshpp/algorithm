package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testNumber = Integer.parseInt(br.readLine());

        String[][] input = new String[testNumber][2];

        for (int i = 0; i < testNumber; i++) {
            input[i][0] = br.readLine();
            input[i][1] = br.readLine();
        }

        int[] solution = solution(input, testNumber);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(String[][] input, int testNumber) {
        int[] result = new int[testNumber];

        for (int i = 0; i < testNumber; i++) {
            StringTokenizer st = new StringTokenizer(input[i][0]);

            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            LinkedList<int[]> q = new LinkedList<>();
            st = new StringTokenizer(input[i][1]);

            for (int j = 0; j < n; j++) {
                q.offer(new int[]{j, Integer.parseInt(st.nextToken())});
            }

            int count = 0;

            while (!q.isEmpty()) {

                int[] front = q.poll();
                boolean isMax = true;

                for (int j = 0; j < q.size(); j++) {
                    if (front[1] < q.get(j)[1]) {
                        q.offer(front);

                        for (int k = 0; k < j; k++) {
                            q.offer(q.poll());
                        }

                        isMax = false;
                        break;
                    }
                }

                if (isMax == false) {
                    continue;
                }

                count++;
                if (front[0] == m) {
                    break;
                }
            }
            result[i] = count;
        }

        return result;
    }
}