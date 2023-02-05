package programmers.level1;

public class No87389 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 1) {
                return answer + i;
            }
        }

        return answer;
    }
}
