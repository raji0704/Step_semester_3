package programming_fundamentals.assigment_problems;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int leftProduct = 1;

        // Forward pass
        for (int i = 0; i < nums.length; i++) {
            answer[i] = leftProduct;
            leftProduct = leftProduct * nums[i];
        }

        int rightProduct = 1;

        // Backward pass
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] = answer[i] * rightProduct;
            rightProduct = rightProduct * nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        ProductOfArrayExceptSelf obj =
                new ProductOfArrayExceptSelf();

        int[] result = obj.productExceptSelf(nums);

        System.out.println("Output: " + Arrays.toString(result));
    }
}
