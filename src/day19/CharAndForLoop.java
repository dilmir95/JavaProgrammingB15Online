package day19;

public class CharAndForLoop {

    public static void main(String[] args) {

        //each character has its own ascii code.
//        char myChar = 100+2;
//        System.out.println(myChar);
//
//        System.out.println(++myChar);
//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.print(i + ",");
//
//
//        }


        for(char iChar= 'A'; iChar<='Z';iChar++){
            System.out.print(iChar+" ");

        }
        System.out.println();
        for(char mine = 'Z';mine>= 'A'; mine--){
            System.out.print(mine+" ");
        }

        //homework
        //create interactive program
        //enter starting character and ending character
        //print everything in between
        System.out.println();

    }
}
