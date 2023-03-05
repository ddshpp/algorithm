package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class No2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testNumber = Integer.parseInt(br.readLine());

        List<Integer> inputs = new ArrayList<>();
        for (int i = 0; i < testNumber; i++) {
            inputs.add(Integer.parseInt(br.readLine()));
        }

        int[] solution = solution(testNumber, inputs);
        for (int i : solution) {
            System.out.println(i);
        }
    }

    public static int[] solution(int testNumber, List<Integer> inputs) {

        int[] numbers = new int[8001];
        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < testNumber; i++) {
            int value = inputs.get(i);
            numbers[value + 4000]++;
            sum += value;

            if (value > max) max = value;
            if (value < min) min = value;
        }

        int middle = 10000;
        int most = 10000;

        int count = 0;
        int mostMax = 0;
        boolean flag = false;

        for (int i = min + 4000; i <= max + 4000; i++) {
            if (numbers[i] > 0) {
                if (count < (testNumber + 1) / 2) {
                    count += numbers[i];
                    middle = i - 4000;
                }
                if (mostMax < numbers[i]) {
                    mostMax = numbers[i];
                    most = i - 4000;
                    flag = true;
                } else if (mostMax == numbers[i] && flag == true) {
                    most = i - 4000;
                    flag = false;
                }
            }
        }

        int[] result = new int[4];
        result[0] = (int) Math.round((sum / testNumber));
        result[1] = middle;
        result[2] = most;
        result[3] = (max - min);

        return result;
    }
}
