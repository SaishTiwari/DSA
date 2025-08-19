public class RemoveEven {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6};


       int[] num = removeEven(arr);

        for(int nums : num){
            System.out.print(nums+" ");
        }

    }
    public static int[] removeEven(int[] arr){

        int oddcount = 0;

        for(int i=0; i< arr.length; i++){
            if (arr[i] % 2 != 0){
                oddcount++;
            }
        }


        int[] result = new int[oddcount];

        int index = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] %2 != 0){
                result[index] = arr[i];
                index++;
            }
        }


        return result;
    }

}
