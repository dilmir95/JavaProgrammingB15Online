package Tasks;
import java.util.*;

public class PracticeSplitAndCharArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String sentence = scan.nextLine();

        String[] eachWord = sentence.split(" ");
        String longest = eachWord[0];
        String shortest = eachWord[0];

        for(String each: eachWord){
            if(each.length()>longest.length()){
                longest=each;
            }else if(each.length()<shortest.length()){
                shortest=each;
            }
        }
        System.out.println("shortest = " + shortest);
        System.out.println("longest = " + longest);
    }
}
