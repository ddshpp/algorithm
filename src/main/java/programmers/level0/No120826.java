package programmers.level0;

public class No120826 {
    public static String solution(String my_string, String letter) {
        String answer = "";

        answer = my_string.replaceAll(letter, "");

        return answer;
    }
}
