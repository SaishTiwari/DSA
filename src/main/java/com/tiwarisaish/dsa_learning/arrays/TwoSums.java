package com.tiwarisaish.dsa_learning.arrays;

public class TwoSums {
    public static void main(String[] args) {
        TwoSums ts = new TwoSums();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = ts.twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[]{left, right};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }

        // If no solution is found
        return new int[]{};
    }
}

