package RecursionLearning;


public class PrintNTimes {
    public static void main(String[] args) {

        func(1,10);

    }
    public static void func(int start, int stop){

        if(start > stop) return;

        System.out.println("Saish");
        start++;
        func(start, stop);

    }

}

