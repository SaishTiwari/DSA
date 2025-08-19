import java.util.Arrays;

public class RotateLeftByK {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        rotate(arr, 3);

    }
    public static void rotate(int[] nums, int x) {


        int[] temp = new int[x];
        for(int i=0; i<x; i++){

            temp[i] = nums[i];
        }
        System.out.println(Arrays.toString(temp));


        for(int i=x; i<nums.length; i++){
            nums[i-x] = nums[i];
        }

        int y=x-1;
        for(int i=nums.length-1; i>=x-1; i--){
            nums[i] = temp[y];
            y--;
        }

        for(int num: nums) {
            System.out.println(num);
        }

    }
}
