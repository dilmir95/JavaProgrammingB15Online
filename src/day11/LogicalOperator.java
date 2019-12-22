package day11;

public class LogicalOperator {
    public static void main(String[] args) {

        /*
        2 pipe || OR operator
        check two conditions and if one is true , whole result will be true


         */
        System.out.println("Logical AND operator");
        System.out.println("result of true and true is:" +(true && true));
        System.out.println("result of false and true is:" +(false && true));
        System.out.println("result of true and false is:" +(true && false));
      System.out.println("result of false and false is:" +(false && false));

        System.out.println("logival OR operator");
        System.out.println("result of true || true is:" +(true || true));
        System.out.println("result of false || true is:" +(false || true));
        System.out.println("result of true || false is:" +(true ||false));
        System.out.println("result of false || false is:" +(false || false));



        int num = 14;

        System.out.println(num>100 || num<10);

        System.out.println(num>10 && num<60 );

        System.out.println(num>50 && num!= 52 || num== 57);

    }
}
