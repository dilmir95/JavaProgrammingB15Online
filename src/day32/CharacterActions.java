package day32;

public class CharacterActions {


    public static void main(String[] args) {


        printAtoZ();
            printAtoZ();

            printAtoZ();
            printZtoA();
    }


    public static void printAtoZ(){
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i+" ");

        }
        System.out.println();
    }

    public static void printZtoA (){
        for (char i = 'Z'; i >='A' ; i--) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
