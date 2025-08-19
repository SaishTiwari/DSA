package RecursionLearning;

public class Factorial {
    public static void main(String[] args){
        int a = func(5);
        System.out.println(a);
}


    public static int func (int i){

        if(i==0){
            return 1;
        }

        if(i==1){
            return 1;
        }

        int fact = i*func(i-1);

        return fact;
    }
}
