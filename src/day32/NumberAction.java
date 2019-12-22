package day32;

public class NumberAction {


    public static void main(String[] args) {

        numberComparison(1,50);
        numberComparison(2,2);
        numberComparison(60,80);

        stringRepeater("Java", 5);

        print1toX(50);
        skipCountBy3to50();
        countDownfrom50to0Even();

        countdown(30,15);

    }
    public static void numberComparison(int num1, int num2){
        if(num1>num2){
            System.out.println(num1+" is more than "+num2);
        }else if(num1<num2){
            System.out.println(num2+" is greater than "+num1);
        }else{
            System.out.println("These numbers are equal");
        }
    }

    public static void stringRepeater (String word, int count){
        for (int i = 1; i <=count ; i++) {
            System.out.print(word+" ");
        }
        System.out.println();
    }
    public static void print1toX(int till){
        for (int i = 0; i <=till ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void skipCountBy3to50(){
        for (int i = 0; i <=50 ; i+=3) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void countDownfrom50to0Even(){
        for (int i = 50; i >=0 ; i--) {
            if(i%2==1){
                continue;
            }else{
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }

    public static void countdown ( int from, int to){
        for (int i = from; i >=to ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

}
