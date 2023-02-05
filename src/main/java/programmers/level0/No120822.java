package programmers.level0;

public class No120822 {
    public static String solution(String my_string) {
        String answer = "";

        int a = my_string.length();

        for (int i = a - 1; i >= 0; i--) {
            answer += my_string.charAt(i) + "";
        }

        return answer;
    }
}
