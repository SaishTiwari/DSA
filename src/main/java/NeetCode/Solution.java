class Solution {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int a = searchInsert(arr, 5);

    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}