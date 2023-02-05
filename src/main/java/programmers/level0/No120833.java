package programmers.level0;

public class No120833 {
    public static int[] solution(int[] numbers, int num1, int num2) {
        int size = num2 - num1 + 1;

        int[] arr = new int[size];

        for (int i = num1; i <= num2; i++) {
            arr[i - num1] = numbers[i];
        }

        return arr;
    }
}
