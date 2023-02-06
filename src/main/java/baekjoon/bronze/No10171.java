package baekjoon.bronze;

public class No10171 {
    public static void main(String[] args) {
        String[] result = solution();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static String[] solution() {
        String[] result = new String[4];
        result[0] = "\\    /\\";
        result[1] = " )  ( ')";
        result[2] = "(  /  )";
        result[3] = " \\(__)|";
        return result;
    }
}
