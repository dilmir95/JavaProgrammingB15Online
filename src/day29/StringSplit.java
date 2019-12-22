package day29;

public class StringSplit {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";

        String[] heroSplit  = hero1.split("-");
       String heroCode = "Hero code is: "+heroSplit[0]+" and identity is "+heroSplit[1];
        System.out.println(heroCode);
        String fullName = heroSplit[1];

            int indexOfSpace = heroSplit[1].indexOf(" ");
        System.out.println(heroSplit[1].substring(0,1)+heroSplit[1].substring(indexOfSpace+1,indexOfSpace+2));

        String[] names = fullName.split(" ");
        System.out.println(names[0].charAt(0)+""+names[1].charAt(0));
    }
}
