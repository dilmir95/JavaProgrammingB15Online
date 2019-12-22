package day21;

public class Taskx {

    public static void main(String[] args) {

        String name = "Dilmurod";
        String chars = "";

        for (int i = 0; i <= name.length() - 1; i++) {
            char currentChar = name.charAt(i);


            if (currentChar == 'm') {
                System.out.println("found it ");
                break;
            }
            System.out.println(currentChar);
        }

        for (int i = 0; i <= name.length() - 1; i++) {
            chars = name.substring(i, i + 1);
                if(chars.equalsIgnoreCase("m")){
                    System.out.println("found it ");
                    break;

                }
            System.out.println(chars);
        }
    }
}