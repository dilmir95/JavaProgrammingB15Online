package Tasks;

public class SuperHeroTask {

    public static void main(String[] args) {

        String[] heroes = {"Superman-Clark Kent",
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

        for (int i = 0; i <heroes.length ; i++) {
            String[] eachSplit = heroes[i].split("-");
            String heroId = eachSplit[0];
            String fullName = eachSplit[1];
            String stars = "";
            for (int j = 0; j <fullName.length() ; j++) {
                stars+="*";
            }
            System.out.println(heroId+"-"+stars);
        }


    }
}
