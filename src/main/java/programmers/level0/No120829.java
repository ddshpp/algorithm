package programmers.level0;

public class No120829 {
    public static int solution(int angle) {
        if (angle < 90) return 1;
        if (angle == 90) return 2;
        if (angle == 180) return 4;
        return 3;
    }
}
