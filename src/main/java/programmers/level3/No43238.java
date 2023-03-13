package programmers.level3;

public class No43238 {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7,10};

        long solution = solution(n, times);
        System.out.println(solution);
    }

    public static long solution(int n, int[] times) {
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < times.length; i++) {
            if (times[i] < min) {
                min = times[i];
            }
            if (times[i] > max) {
                max = times[i];
            }
        }

        long minTime = min / times.length * n;
        long maxTime = max / times.length * n;

        long midTime = (minTime + maxTime) / 2;
        long success = 0;
        long fail = 0;

        while (success - fail != 1) {
            long count = 0;

            for (int i = 0; i < times.length; i++) {
                count += midTime / times[i];
            }

            if (count >= n) {
                success = midTime;
                maxTime = midTime;
                midTime = (midTime + maxTime) / 2;
            } else {
                fail = midTime;
                minTime = midTime;
                midTime = (minTime + maxTime) / 2;
            }
        }

        return success;
    }
}
