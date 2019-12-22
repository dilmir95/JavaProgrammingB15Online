package day32;

public class CharScanner {

    public static void main(String[] args) {

        charPrint('A','F');
        charPrint('d','z');

        charPrint('z','g');


    }

    public static void charPrint(char char1, char char2){
        if(char1<char2) {
            for (char i = char1; i <= char2; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }if(char1>char2){
            for (char i = char1; i >=char2 ; i--) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
