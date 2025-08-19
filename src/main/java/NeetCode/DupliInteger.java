package NeetCode;

public class DupliInteger {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 4};


        for(int i =0; i< args.length; i++){
            for (int j=0 ; j<i; j++){

                if(arr[j] == arr[i]){
                    System.out.println("True");
                    break;
                }
                else {
                    System.out.println("false");
                }
            }



    }


}


}
