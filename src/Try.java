import java.util.Arrays;

public class Try {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        // Increment the last element by 1
        arr[arr.length - 1] = arr[arr.length - 1] + 1;

        // Print the array using Arrays.toString
        System.out.println(Arrays.toString(arr));
    }
}