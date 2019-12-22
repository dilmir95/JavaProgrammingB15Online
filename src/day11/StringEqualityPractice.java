package day11;

public class StringEqualityPractice {

    public static void main(String[] args) {

        //System.out.println("Java".equals("java"));
        String myStr = "Cava";
        //System.out.println(myStr.equals("Java"));
        String yourStr = new String("Java");


       // System.out.println(myStr.equals(yourStr));

        if(myStr.equals("Java")){
            System.out.println("Correct Word!");
        }else{
            System.out.println("Say Java!!");
        }

        if(myStr.equals(yourStr)){
            System.out.println("Correct Word YaY!");
        }else if(myStr.equals("Cava")){
            System.out.println("Pumpkin");
        }else{
            System.out.println("Figure it out!");
        }





    }
}
