package programmers.level0;

public class No120830 {
    public static int solution(int n, int k) {
        int service = n / 10;
        return (n * 12000) + (k - service) * 2000;
    }
}
