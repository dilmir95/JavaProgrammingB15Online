package day16;

public class WhileLoopPractice2 {

    public static void main(String[] args) {

        int countOfFingers = 1;
        while(countOfFingers<11){
            System.out.println("countOfFingers = " + countOfFingers);
            ++countOfFingers;
            //100,101,102,103,104,105
        }
        int chickenCount = 1;
        while(chickenCount<9){
            System.out.print("chicken in the kitchen " );

            ++chickenCount;
        }
    }
}
