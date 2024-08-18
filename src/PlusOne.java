public class PlusOne {
    public static void main(String[] args) {

    }
    public int[] plusOne(int[] digits) {

        for(int i=0; i<digits.length; i++){
            if(digits[digits.length-1] == 9){
                int[] digits2 = new int[digits.length];
                digits2[i] = digits[i];
                digits2[digits2.length-2] = 1;
                digits2[digits.length-1] = 0;

                return digits2;

            }
            else {
             digits[digits.length-1] = digits[digits.length-1] + 1;

            }
        }

        return digits;
    }


}
