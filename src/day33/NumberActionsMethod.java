package day33;

public class NumberActionsMethod {

    public static void main(String[] args) {

        System.out.println(getTheSumFrom1toX(10));


        System.out.println(buildEmail("Dilmurod","Yakubov"));


        System.out.println(buildEmailGOT("Dilmurod Ismagilovich"));
    }

    public static int getTheSumFrom1toX(int x){

        int sum =0;
        for (int i = 1; i <=x ; i++) {
            sum+= i;
        }
        return sum;
    }

    public static String buildEmail(String firstName , String lastName){
        String email = firstName.charAt(0)+lastName+"@NightWatch.com";
        return email;
    }

    public static String buildEmailGOT(String fullName){
        String[] eachName = fullName.split(" ");
        String firstName = eachName[0];
        String lastName = eachName[1];
        String email = firstName.charAt(0)+lastName+"@NightWatch.com";

        return email;
    }
}
