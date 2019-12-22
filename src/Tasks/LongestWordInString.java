package Tasks;

public class LongestWordInString {


    public static void main(String[] args) {

        String[] names = {"Jack","Nelson", "Dilmurodddd", "Toshpolat","Nick", "Boburboburbob"};

        String longest = names[0];
        int compareLength = longest.length();

        for (int i = 0; i <= names.length-1 ; i++) {
            if(longest.length()<names[i].length()){
                longest= names[i];

            }
        }
        System.out.println(longest);

        /*
        write down the first string as longest one temporarily
        then go through each string to check if it is longer than the first string
        if the string is longer than the first string then replace it with the new string length
        keep doing it until you there are no more strings left in the array

         */

        for (String name : names) {
            if(longest.length()<name.length()){
                longest=name;

            }
        }
        System.out.println("longest string is = " + longest);;
    }
}
