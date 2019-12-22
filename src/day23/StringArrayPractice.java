package day23;

public class StringArrayPractice {

    public static void main(String[] args) {

        String[] shows = {"Orville", "Narcos", "GOT", "Punisher", "Arrow", "13 reasons why"};
        
        int showCount = shows.length;
        System.out.println("showCount = " + showCount);

        for (int i = 0; i <=showCount-1 ; i++) {
            System.out.println(shows[i]+ " has a character count of "+ shows[i].length());

        }
    }
}
