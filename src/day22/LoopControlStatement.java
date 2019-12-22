package day22;

public class LoopControlStatement {

    public static void main(String[] args) {

        String java = "I struggle with java i like java i love java eerything is awesome!";


        for (int i = 0; i <=java.length()-1 ; i++) {
            if(i%2==1) {
                continue;
            }

            System.out.print(java.charAt(i));

        }
        System.out.println();

        for (int j = 0; j <= java.length()-1 ; j++) {
            if(java.charAt(j)=='a'){
                break;
            }
            System.out.print(java.charAt(j));
        }
        System.out.println();
            int countOfJ=0;
        for (int idx = 0; idx <=java.length()-1 ; idx++) {
            String currentChar = java.substring(idx, idx+1);
            if(currentChar.equalsIgnoreCase("j")){
                ++countOfJ;


            }if(countOfJ==3){
                break;
            }

            System.out.print(currentChar);
        }

    }
}
