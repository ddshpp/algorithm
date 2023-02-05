package programmers.level0;

public class No120821 {
    public static int[] solution(int[] num_list) {
        int size = num_list.length;
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[size - 1 - i] = num_list[i];
        }
        return arr;
    }
}
