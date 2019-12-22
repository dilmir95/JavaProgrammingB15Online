package day32;

public class StringAction {

    public static void main(String[] args) {
        reversePrintMyOwnName();

        printStringWithDashInBetween("Ismagilovich");
        printStringWithDashInBetween("Yakubov");
        printStringWithDashInBetween("Dilmurod");
    }

        public static void reversePrintMyOwnName(){
        String name = "Dilmurod";
            for (int i = name.length()-1; i >=0 ; i--) {
                System.out.print(name.charAt(i));
                if(i != 0 ){
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        public static void printStringWithDashInBetween(String name){
            for (int i = 0; i <name.length() ; i++) {
                System.out.print(name.charAt(i));
                if(i != name.length()-1){
                    System.out.print("-");
                }
            }
            System.out.println();
        }
}
