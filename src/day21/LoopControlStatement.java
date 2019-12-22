package day21;

public class LoopControlStatement {


    public static void main(String[] args) {

        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);

            if(i==5) {
                break;
            }
        }
        int sum=0;

        for (int i = 1; i <=10 ; i++) {
            System.out.println("current sum is"+ sum);
            System.out.println("if i add "+ i+" dollar it would be "+(i+sum));

            if(sum+i > 12){ //limit is 40 and we have to check before putting the new number if the sum will
                             //go over  40 or not first , thats why we use sum+i >40

                break;

            }
            sum+=i;
        }
        System.out.println("final sum is "+sum);
    }
}
