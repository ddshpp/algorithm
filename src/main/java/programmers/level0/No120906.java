package programmers.level0;

public class No120906 {
    public static int solution(int n) {
        int answer = 0;

        for (int i = n; i >= n; i--) {
            answer += n % 10;
            n = n / 10;
        }

        return answer;
    }
}
