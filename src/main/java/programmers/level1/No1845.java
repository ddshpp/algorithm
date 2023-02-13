package programmers.level1;

import java.util.HashSet;

public class No1845 {
    public static int solution(int[] nums) {
        int max = nums.length / 2;
        HashSet<Integer> temp = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            temp.add(nums[i]);
        }

        if (temp.size() > max) {
            return max;
        } else {
            return temp.size();
        }
    }
}
