package day50;

public class Substraction extends Question {

    public Substraction(int num1, int num2, String operator, String questionType){
        super("-","subtract");
        this.num1 = num1;
        this.num1 = num2;
        int temp=num1;
        if(num1<num2){
            num1 = num2;
            num2 = temp;


        }
        this.num1 = num1;
        this.num2 = num2;


    }

    @Override
    public void calculate() {
        answer = num1 - num2;
        isCalculated = true;
    }
    public String toString(){
        if (isCalculated) {
            return num1 + operator + num2 + "=" + answer;
        }else{
            return num1 + operator + num2 + "=" ;
    }

    }
}
