package day44;

public class SlackUser {

    protected String name;

    protected String status;


    public void sendMessage(String x ){
        System.out.println("Sending message: "+ x);
    }

    public void callSomeone(long x){
        System.out.println("Please call: "+ x);
    }
    public void addEmoji(String x){
        System.out.println("Add emoji: "+ x);
    }

}
