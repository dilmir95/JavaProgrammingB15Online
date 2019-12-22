package day25;

public class FindLongestWord {

    public static void main(String[] args) {
        
        String sentence = "we are trying to find the longest word";
        
        String[] words = sentence.split(" ");
        
        String longestWord = words[0];

        for (String currentWord : words) {
            System.out.println("currentWord = " + currentWord);
            if(currentWord.length()>longestWord.length()){
                longestWord=currentWord;
            }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
