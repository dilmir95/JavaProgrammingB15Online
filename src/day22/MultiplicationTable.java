package day22;

public class MultiplicationTable {

    public static void main(String[] args) {



        for (int i = 1; i <=10 ; i++) {
            System.out.println("Multiplicatin table for "+i);
            for (int j = 1; j <=12 ; j++) {
                System.out.println(i+"x"+j+"="+i*j);
            }
        }
    }
}
