package day21;

public class LoopControlStatement2 {


    public static void main(String[] args) {
            /// to print only even number we have to say skip odd numbers by using continue

        for (int i = 1; i <=10; i++) {
            if(i%2==1){
                continue;
            }
            System.out.println(i);

        }


        for (int i = 1; i <=100 ; i++) {
            if(i%5==0){
                continue;
            }
            System.out.println(i);
        }
    }
}
