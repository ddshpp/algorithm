package programmers.level0;

public class No120849 {
    public static String solution(String my_string) {
        String[] aeiou = {"a", "e", "i", "o", "u"};
        for (int i = 0; i < 5; i++) {
            my_string = my_string.replaceAll(aeiou[i], "");
        }
        return my_string;
    }
}
