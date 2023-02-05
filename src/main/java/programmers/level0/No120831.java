package programmers.level0;

public class No120831 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 2; i <= n; i += 2) {
            answer += i;
        }
        return answer;
    }
}
