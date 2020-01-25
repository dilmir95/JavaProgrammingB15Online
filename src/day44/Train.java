package day44;

public class Train extends Vehicle {

    int wagonCount;


    public void makeChoCHoSound (){
        System.out.println("CHOOCHOO");
    }

    public static void main(String[] args) {


        Train t1 = new Train();
        t1.makeChoCHoSound();
        t1.make = "Rolls-Royse";
        t1.setYear(154);


        t1.wagonCount=89;

        t1.goForward();

        t1.channelUp();
        System.out.println(t1.channel);

    }
}
