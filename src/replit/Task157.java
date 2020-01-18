package replit;

public class Task157 {

    public static void main(String[] args) {

        timeConversion("07:05:45PM");
        timeConversion("02:55:00PM");

    }

    public static void timeConversion(String s){
       int time= Integer.parseInt(s.substring(0,2));
       int military = time+12;
       String rep = String.valueOf(military);

       String newTime = s.replace(s.substring(0,2), rep);
        System.out.println(newTime);
    }
}
