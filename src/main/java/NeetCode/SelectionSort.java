public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = {9,3,8,1,7,2};
        int temp = 0;
        int minIndex = -1;


        for(int i=0; i<arr.length; i++){
            minIndex = i;
            for(int j=i+1; j< arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;


        }


        for(int nums : arr){
            System.out.println(nums);
        }
    }
}
