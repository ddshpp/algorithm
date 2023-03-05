package baekjoon.gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstInput = br.readLine();

        StringTokenizer st = new StringTokenizer(firstInput);
        int houseCount = Integer.parseInt(st.nextToken());
        int modem = Integer.parseInt(st.nextToken());

        int[] house = new int[houseCount];
        for (int i = 0; i < houseCount; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        int solution = solution(houseCount, modem, house);
        System.out.println(solution);
    }

    public static int solution(int houseCount, int modem, int[] house) {
        Arrays.sort(house);

        int max = house[houseCount - 1] - house[0] + 1;
        int min = 1;

        while (min < max) {
            int mid = (min + max) / 2;
            if (solution2(mid, houseCount, house) < modem) max = mid;
            else min = mid + 1;
        }

        return (min - 1);
    }

    public static int solution2(int mid, int houseCount, int[] house) {
        int count = 1;
        int last = house[0];

        for (int i = 1; i < houseCount; i++) {
            int temp = house[i];

            if ((temp - last) >= mid) {
                count++;
                last = temp;
            }
        }
        return count;
    }
}
