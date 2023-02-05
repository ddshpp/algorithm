package programmers.level0;

public class No120814 {
    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if ((7 * i) >= n) {
                return i;
            }
        }
        return answer;
    }
}
