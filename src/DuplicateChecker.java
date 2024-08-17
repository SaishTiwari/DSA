import java.util.Scanner;

public class DuplicateChecker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[5];
        System.out.println("Enter 5 numbers");

        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        boolean a = hasDuplicate(num);
        if (a){
            System.out.printf("Yes");
        }
        else{
            System.out.printf("No");
        }
    }

    public static boolean hasDuplicate(int[] num) {
        for (int i=0 ; i< num.length; i++){
            for (int j =i+1 ; j< num.length; j++){
                if (num[i] == num[j]){
                    return true;
                }

            }
        }
        return false;
    }
}
