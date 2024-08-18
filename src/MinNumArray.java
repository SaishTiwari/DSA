public class MinNumArray {
    public static void main(String[] args) {
        int[] arr = {8,4,6,2,9,1};
        int b = minNum(arr);
        System.out.println("The minimum number in the array is "+ b);

    }
    public static int minNum(int[] arr){
        int minnum = arr[0];
        for(int i=1; i< arr.length; i++){
            if(arr[i]<minnum){
                minnum = arr[i];
            }
        }
        return minnum;


    }
}
