public class ArrayRev {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int index = 0;
        int[] rev = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
              rev[index] = arr[i];
              index++;
        }

        for(int nums: rev){
            System.out.println(nums);
        }
    }
}
