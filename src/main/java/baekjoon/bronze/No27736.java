package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class No27736 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long allStudents = Integer.parseInt(br.readLine());

        List<Integer> votes = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < allStudents; i++) {
            votes.add(Integer.valueOf(st.nextToken()));
        }

        String solution = solution(allStudents, votes);
        System.out.println(solution);
    }

    public static String solution(long allStudents, List<Integer> votes) {
        long yes = 0;
        long no = 0;
        long invalid = 0;

        for (int i = 0; i < allStudents; i++) {
            if (votes.get(i) == 1) {
                yes++;
            }
            if (votes.get(i) == -1) {
                no++;
            }
            if (votes.get(i) == 0) {
                invalid++;
            }
        }

        if ((invalid * 2) >= allStudents) {
            return "INVALID";
        }else if (yes > no) {
            return "APPROVED";
        } else {
            return "REJECTED";
        }
    }
}
