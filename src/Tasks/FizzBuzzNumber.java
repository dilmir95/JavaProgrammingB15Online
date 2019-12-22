package Tasks;

public class FizzBuzzNumber {

    public static void main(String[] args) {

        for (int i = 1; i <=50 ; i++) {
            if(i%3==0 && i%5==0){
                System.out.println(i+" is a fizzbuzz number");
            }else if(i%3==0){
                System.out.println(i+"  is a fizz number");
            }else if (i%5==0){
                System.out.println(i+" is a buzz number");
            }
        }
    }
}
