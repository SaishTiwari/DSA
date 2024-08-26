public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 5, 6, 7, 8};

        int a = binarySearch(arr, 3);
        System.out.println(a);
    }

    public static int binarySearch(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}