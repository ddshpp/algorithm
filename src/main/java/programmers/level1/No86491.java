package programmers.level1;

public class No86491 {
    public static void main(String[] args) {

    }

    public static int solution(int[][] sizes) {
        int maxX = 0;
        int maxY = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                int temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }

            if (sizes[i][0] > maxX) {
                maxX = sizes[i][0];
            }
            if (sizes[i][1] > maxY) {
                maxY = sizes[i][1];
            }
        }

        return maxX*maxY;
    }
}
