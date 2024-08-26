import java.util.Arrays;

public class ZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {0};
        moveZeroes(arr);
    }


    public static void moveZeroes(int[] nums) {

        int j = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] ==0){
                j = i;
                break;

            }
        }

        if(j==-1){
            return;
        }


        int temp = 0;
        for(int i=j+1; i<nums.length; i++){
            if(nums[i] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
