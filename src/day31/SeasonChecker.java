package day31;

public class SeasonChecker {


    public static void main(String[] args) {

        decideSeasonAction("Winter");
        System.out.println("=====================");
        decideSeasonAction("jack");
    }

    public static void decideSeasonAction (String season){
        if(season.equals("Winter")){
            System.out.println("Go to Skiing");
            System.out.println("Build a snowman");
            System.out.println("Celebrate New Year");
        }else if(season.equals("Spring")){
            System.out.println("Clebrate Nawruz");
            System.out.println("Go hiking");
        }else if(season.equals("Summer")){
            System.out.println("Go swimming");
            System.out.println("Go to the beach");
            System.out.println("Enjoy your Summer");
        }else if(season.equals("Fall")){
            System.out.println("Halloween");
            System.out.println("Thanksgiving");
        }else{
            System.out.println("Invalid season");
        }
    }
}
