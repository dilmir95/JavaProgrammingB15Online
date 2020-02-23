package day50;

public abstract class Question {


    int num1;
    int num2;
    String operator;
    int answer;
    boolean isCalculated;
    String questionType = "Unknown";

    public Question(String operator, String questionType) {
        this.operator = operator;
        this.questionType = questionType;
    }
    public String toString(){
        return "this question is: "+questionType;
    }

    public abstract void calculate();


}
