package baekjoon.bronze;

public class No10172 {
    public static void main(String[] args) {
        String[] result = solution();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] solution() {
        String[] result = new String[5];
        result[0] = "|\\_/|";
        result[1] = "|q p|   /}";
        result[2] = "( 0 )\"\"\"\\";
        result[3] = "|\"^\"`    |";
        result[4] = "||_/=\\\\__|";
        return result;
    }
}
