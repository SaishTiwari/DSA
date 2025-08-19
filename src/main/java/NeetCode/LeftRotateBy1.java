public class LeftRotateBy1 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};

        int[] b = leftRotate(nums);
        for(int num: b){
            System.out.print(num);
        }

    }

    public static int[] leftRotate(int[] nums){

        int temp= nums[0];
        for(int i=1; i< nums.length; i++){

            nums[i-1] = nums[i];

            }
        nums[nums.length-1] = temp;
        return nums;
        }



    }

