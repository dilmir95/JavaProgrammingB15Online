package OfficeHour;

public class Practice12_23_part2 {

    public static void main(String[] args) {
        add(12,12); //cannot store value in a variable because it does not return anything


       int addition= addWithReturn(15,10);
        System.out.println(addition);         //with return method you can save value into a variable;
    }

    public static void add(int num1,int num2){
        System.out.println(num1+num2);
    }

    public static int addWithReturn(int num3,int num4){
        int result = num3+num4;
        return  result;
    }
}
