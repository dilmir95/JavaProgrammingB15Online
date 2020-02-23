package day50;

public class Addition extends Question {

    public Addition(String operator, String questionType, int num1, int num2) {
        super(operator = "+", questionType = "addition");
        this.num1 = num1;
        this.num2 = num2;

    }

    @Override
    public void calculate() {
        this.answer = num1 + num2;
        this.isCalculated = true;


    }

    public String toString() {
        if (isCalculated) {
            return num1 + operator + num2 + "=" + answer;
        }else{
            return num1 + operator + num2 + "=" ;
        }
    }
}