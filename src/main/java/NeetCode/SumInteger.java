import java.util.Scanner;

public class SumInteger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[3];

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a target:");
        int target = sc.nextInt();

        SumInteger si = new SumInteger();

        int[] result = si.twoSum(arr, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers add up to the target.");
        }
    }

    public int[] twoSum(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }
}