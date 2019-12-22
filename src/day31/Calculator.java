package day31;

public class Calculator {

    public static void main(String[] args) {

      calculate('*',2,2);

      calculate('/',40,10);

      calculate('+',10,90);



    }
    public static void calculate(char operator, int num1, int num2){
        switch (operator){
            case '+':
                System.out.println("addition result: "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction result: "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication result: "+(num1*num2));
                break;
            case '/':
                System.out.println("division result: "+(num1+num2)  );
                break;
            default:
                System.out.println("invalid operator");
        }

    }
}
