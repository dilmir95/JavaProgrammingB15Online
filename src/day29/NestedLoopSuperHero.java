package day29;

public class NestedLoopSuperHero {

    public static void main(String[] args) {

        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};


        String stars ="";
            String heroX ="";
        for (int i = 0; i <allHeroes.length ; i++) {
           String[] splittedEach= allHeroes[i].split("-");
           String heroId = splittedEach[0];
           String fullName = splittedEach[1];
             stars ="";
            for (int j = 0; j <fullName.length() ; j++) {
                stars+="*";

            }
            System.out.println(heroId+"-"+stars);
        }

    }
}
