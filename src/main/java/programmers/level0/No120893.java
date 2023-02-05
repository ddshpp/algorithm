package programmers.level0;

public class No120893 {
    /*
    생각보다 오래걸린 문제
    각각 쪼개서 아스키코드를 이래저래 건드릴라 했지만 잘 안됐다
    그러던중
    Character.isUpperCase 이런걸 알게됐고 성공
    */

    public static String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {

            if (Character.isUpperCase(my_string.charAt(i))) {
                answer += Character.toLowerCase(my_string.charAt(i));
            } else {
                answer += Character.toUpperCase(my_string.charAt(i));
            }
        }
        return answer;
    }
}
