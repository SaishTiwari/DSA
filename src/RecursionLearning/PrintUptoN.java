package RecursionLearning;

public class PrintUptoN {

    static int cnt = 0;
        static void print(){

            // Base Condition.
            if(cnt == 10 ) return;
            System.out.println(cnt);

            cnt = cnt+1;
            print();

        }
        public static void main(String[] args) {
            print();
        }
    }

