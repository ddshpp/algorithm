package programmers.level0;

public class No120844 {
    public static int[] solution(int[] numbers, String direction) {
        int temp = 0;

        if (direction.equals("right")) {
            temp = numbers[numbers.length - 1];
            for (int i = numbers.length - 1; i > 0; i--) {
                numbers[i] = numbers[i - 1];
            }
            numbers[0] = temp;
            return numbers;
        }

        if (direction.equals("left")) {
            temp = numbers[0];
            for (int i = 0; i < numbers.length - 1; i++) {
                numbers[i] = numbers[i + 1];
            }
            numbers[numbers.length - 1] = temp;
            return numbers;
        }

        return numbers;
    }
}
