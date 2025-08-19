public class BubbleSort {

    public static void main(String[] args) {

        int num[] = {4,3,6,2,1};

        for(int i=0; i<num.length; i++){
            for(int j=0; j< num.length-1-i; j++){
                if(num[j]<num[j+1]){
                    int temp =0;
                    temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }

        }

        for(int nums : num){
            System.out.println(nums);
        }
    }
}
