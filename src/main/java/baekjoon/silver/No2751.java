package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        String solution = solution(list);
        System.out.println(solution);
    }

    public static String solution(List<Integer> list) {
        StringBuilder sb = new StringBuilder();
        Collections.sort(list);

        for (int i : list
        ) {
            sb.append(i).append('\n');
        }

        return String.valueOf(sb);
    }
}
