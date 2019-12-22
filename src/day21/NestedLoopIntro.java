package day21;

public class NestedLoopIntro {

    public static void main(String[] args) {

//
//        for (int x = 1; x <= 5; x++) {
//            System.out.print(x);
//
//            }
//        System.out.println();
//        for (int x = 1; x <= 5; x++) {
//            System.out.print(x);
//
//        }
//        System.out.println();
//        for (int x = 1; x <= 5; x++) {
//            System.out.print(x);
//
//        }
//        System.out.println();

        for (int i = 1; i <=3 ; i++) {
            System.out.println("iteration "+ i);
            for (int x = 1; x <= 5; x++) {
                System.out.print(x);

            }
            System.out.println();
        }

        for (int i = 1; i <=10 ; i++) {
            for (char j = 'a'; j <='g' ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
