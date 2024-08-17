public class AnagramChecker {

    public static void main(String[] args) {

        String a = "SAish";
        String b = "HIsAd";

        char[] c1 = a.toLowerCase().toCharArray();
        char[] c2 = b.toLowerCase().toCharArray();

        bubbleSort(c1);
        bubbleSort(c2);

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }

    public static void bubbleSort(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}