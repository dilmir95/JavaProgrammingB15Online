package day08;

public class IfStatement {
    public static void main(String[] args) {
        int speedLimit = 60;
        int yourCurrentSpeed = 45;
        boolean IamSpeeding = (yourCurrentSpeed>speedLimit);

        if(IamSpeeding){
            System.out.println("get pulled over by police");
            System.out.println("license taken away");
            System.out.println("go to court");

        }else  {
            System.out.println("go shopping");
            System.out.println("buy ice cream");
            System.out.println("enjoy your day");}


        System.out.println("the end");
        }
}
