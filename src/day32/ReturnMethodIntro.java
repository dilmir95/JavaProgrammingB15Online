package day32;

public class ReturnMethodIntro {

    public static void main(String[] args) {

      String name =   giveMeMyName();
        System.out.println("name = " + name);
        
        
        int dd= doubleTheValue(40);
        System.out.println("dd = " + dd);

        System.out.println("the result of doubling 100 is "+ doubleTheValue(100));
        
        
        int addition= add(25,50);
        System.out.println("addition = " + addition);

        System.out.println(add(50,70));

    }

    public static String giveMeMyName(){
        return "Dilmurod";
    }
    
    public static int doubleTheValue(int num1){
        return num1*2;
    }
    
    public static int add(int num1,int num2){
        int result = num1+num2;
        return result;
    }
}
