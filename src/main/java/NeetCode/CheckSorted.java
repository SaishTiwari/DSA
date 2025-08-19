public class CheckSorted {

    public static void main(String[] args) {

        int[] arr = {1,2,7,3,4};
        for(int i=0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]) {
                System.out.println("Array is not sorted");

            }



        }


    }
}
