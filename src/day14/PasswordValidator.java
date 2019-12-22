package day14;

public class PasswordValidator {

    public static void main(String[] args) {

        //min 8 char
        //max 16 char
        // must contain _ or $
        //it must not contain space
        //it must start with Ab

        String password = "Abracadab$";
            boolean minMax = password.length() >=8 && password.length() <=16;
            boolean mustContain = password.contains("$") || password.contains("_");
            boolean noSpace = !password.contains(" ");
            boolean startWith = password.startsWith("Ab");


        if(minMax && mustContain && noSpace && startWith){
            System.out.println("Valid password");
        }else{
            System.out.println("invalid password");
        }
    }
}
