public class SecondLargestNumArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 5, 4};
        int b = secondLargest(arr);
        System.out.println("The second largest number is " + b);
    }

    public static int secondLargest(int[] arr) {
        int largestNum = Integer.MIN_VALUE;
        int secondLargestNum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNum) {
                secondLargestNum = largestNum;
                largestNum = arr[i];
            } else if (arr[i] > secondLargestNum && arr[i] != largestNum) {
                secondLargestNum = arr[i];
            }
        }

        return secondLargestNum;
    }
}