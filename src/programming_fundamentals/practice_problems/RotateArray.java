package programming_fundamentals.practice_problems;

import java.util.Arrays;

public class RotateArray {

    public int[] rotateArray(int[] nums, int k) {

        k = k % nums.length;

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[(i + k) % nums.length] = nums[i];
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        RotateArray obj = new RotateArray();

        int[] result = obj.rotateArray(nums, k);

        System.out.println("Rotated Array: " + Arrays.toString(result));
    }
}
