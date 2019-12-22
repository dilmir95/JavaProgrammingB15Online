package day20;

public class PalindromeTest {

    public static void main(String[] args) {

        //if you reverse a string and it does not change it means it is a palindrome
        // for ex ; Aziza is backwards Aziza, level, kayak, elle , Anna;


        String word = "Aziza";
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+= word.charAt(i);
        }
        System.out.println("reversed = " + reversed);
        if(word.equalsIgnoreCase(reversed)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
    }
}
