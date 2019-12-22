package day17;

public class WhileLoopPractivenNum {

    public static void main(String[] args) {

        int count = 100;
        int until = 0;

        while(count>=until){
            if(count%2 == 0){
                System.out.print(count+", ");
            }
            --count;
        }
    }
}
