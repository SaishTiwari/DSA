public class RemoveTargetElement {
    public static void main(String[] args) {

        int[] abc = {1,2,3,4,5,4,2,4,6,2,3,3,4,5};
        int c = removeTarget(abc, 3);
        System.out.println(c);
//        for(int nums : c){
//            System.out.print(nums+" ");
//        }






    }
    public static int removeTarget(int[] arr, int target){

        int newarr = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != target){
                newarr++;
            }
        }

        int[] finalArray = new int[newarr];
        int index= 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != target){
                finalArray[index] = arr[i];
                index++;

            }
        }
        return finalArray.length;

    }
}
