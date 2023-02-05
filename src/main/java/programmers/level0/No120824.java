package programmers.level0;

public class No120824 {
    public static int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int evenNumber = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                evenNumber++;
            }
        }

        int oddNumber = num_list.length - evenNumber;
        answer[0] = evenNumber;
        answer[1] = oddNumber;

        return answer;
    }
}
