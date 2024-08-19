import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};

        // Increment the last element by 1
     //   arr[arr.length - 1] = arr[arr.length - 1] + 1;

        // Print the array using Arrays.toString
        System.out.println(Arrays.toString(arr));

//
//        int temp = 0;
//        for (int i = 0; i<arr.length;i++){
//            for(int j=0; j<arr.length-1-i; j++){
//                if(arr[j]>arr[j+1]){
//                    temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//
//        for(int i=arr.length-2; i>=0; i--) {
//            if (arr[arr.length - 1] != arr[i]) {
//                System.out.println("The second largest number is " + arr[i]);
//                break;
//            }
//
//
//        }
int temp = 0;
        int largest = arr[0];
        int secondLargest = -1; //Assume that no negative numbers is there, if negative numbers exists use .MinValue func.
        temp = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest){
                temp = largest;
                largest = arr[i];
                secondLargest = temp;
            }
            else if (arr[i] <largest && arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }
        System.out.println("The second largest is "+ secondLargest);
    }
}