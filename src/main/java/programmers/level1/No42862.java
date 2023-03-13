package programmers.level1;

public class No42862 {
    public static void main(String[] args) {

    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int[] student = new int[n + 1];

        for (int i = 0; i < lost.length; i++) {
            student[lost[i]]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            student[reserve[i]]++;
        }

        for (int i = 2; i < student.length; i++) {
            if (student[i-1] == -1  && student[i] == 1) {
                student[i-1]++;
                student[i]--;
            }
            else if (student[i-1] == 1 && student[i] == -1) {
                student[i-1]--;
                student[i]++;
            }
        }

        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (student[i] >= 0) {
                count++;
            }
        }

        return count;
    }
}
