package programmers.skillCheck;

public class test {
    public static void main(String[] args) {
        int n = 78;

        int solution = solution(n);
        System.out.println(solution);
    }

    public static int solution(int n) {
        int copyn = n;

        int count = 1;
        while (copyn > 1) {
            if (copyn%2 == 1) {
                count++;
            }

            copyn = copyn/2;
        }

        int answer = 0;
        for (int i = n+1; i < 1000001; i++) {
            int i1 = solution2(i);

            if (count == i1) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    public static int solution2(int m) {
        int count = 1;
        while (m > 1) {
            if (m%2 == 1) {
                count++;
            }

            m = m/2;
        }
        return count;
    }
}
