package replit;

public class Task203 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("civic"));


    }

    public static boolean isPalindrome (String check){
        String result = "";
        String check1 = check.replace(" ","");

        for (int i = check1.length()-1; i >=0 ; i--) {

            result+= check1.charAt(i);
        }
        if(result.equalsIgnoreCase(check1)){
            return true;
        }
        return false;
    }
}
