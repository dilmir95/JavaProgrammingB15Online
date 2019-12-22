package day22;

public class CanvasDayModuleLinkGenerator {


    public static void main(String[] args) {

        //https://learn.cybertekschool.com/courses/278/modules#3317

        int modules = 3317;
        int day = 21;

        for (int i = day; i <=56  ; i++) {
            System.out.println("https://learn.cybertekschool.com/courses/278/modules#"+modules+" this will lead" +
                    " you to the day "+ i  );
                ++modules;
        }


    }
}
