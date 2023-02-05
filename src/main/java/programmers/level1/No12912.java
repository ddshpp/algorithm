package programmers.level1;

public class No12912 {
    public static long solution(int a, int b) {
        long answer = 0;
        int c = 0;
        if (a > b) {
            c = b;
            b = a;
            a = c;
        }
        for (int i = a; i <= b; i++) {
            answer += i;
        }
        return answer;
    }
}
