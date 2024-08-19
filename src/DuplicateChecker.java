class DuplicateChecker {
    public static void main (String[] args) {
        int[] arr = {1,2,2,3,4,5,5,6,7,8,8};
        int a = removeDuplicates(arr);
        System.out.println(a);


    }
    public static int removeDuplicates(int[] nums) {
        int j =0;
        for(int i=1; i< nums.length; i++){
            if(nums[i] != nums[j]){
                nums[j+1] = nums[i];
                j++;
            }
        }

        return (j+1);

    }
}