public class Palindrome {
    public static void main(String[] args) {

        String a = "saish";
        String rev = "";
        for(int i=a.length()-1; i>=0; i--){
            rev = rev + a.charAt(i);
        }

    }
}
