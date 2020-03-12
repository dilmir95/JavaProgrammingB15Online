package CodingBat;

public class MultiplicationTable {

    public static void main(String[] args) {
        //multiplicationTable(5);
        multiplicationTable1to10();

    }
    public static void multiplicationTable(int num){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(""+num+" * "+ i+" =" +(num*i));
        }
    }
    public static void multiplicationTable1to10(){
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+""+" * "+j+" ="+(i*j));
            }
            System.out.println();
        }
    }
}
