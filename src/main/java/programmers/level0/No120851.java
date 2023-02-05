package programmers.level0;

public class No120851 {
    public static int solution(String my_string) {
        int answer = 0;

        //문자열을 각각 쪼개기
        String[] result = my_string.split("");

        //각각 숫자인지 확인
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < 10; j++) {
                String a = j + "";
                if (result[i].equals(a)) {
                    answer += j;
                }
            }
        }
        return answer;
    }
}
