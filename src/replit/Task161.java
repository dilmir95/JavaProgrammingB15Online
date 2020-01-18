package replit;

public class Task161 {

    public static void main(String[] args) {
        
        isPalindrome(5000057);


    }

    public static void isPalindrome (int num){

        String check = String.valueOf(num);

        char[] numArray = check.toCharArray();
        int y = -1;
        boolean result = true;
        int lastIndex = numArray.length-1;
        for (int i = 0; i <lastIndex/2 ; i++) {
            if(numArray[i]!=numArray[lastIndex]) {
                result=false;
                break;
            }
            --lastIndex;
        }
        System.out.println(result);

    }
}
