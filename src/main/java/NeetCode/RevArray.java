public class RevArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        int[] b = reverseArray(arr);
        for(int nums : b){
            System.out.print(nums+" ");
        }
    }

    public static int[] reverseArray(int[] arr){

        int index = 0;
        int[] result = new int[arr.length];
        for(int i= arr.length-1; i>=0; i--){
            result[index] = arr[i];
            index++;

        }
        return result;
    }
}
