package Tasks;

public class SpeedLimitMethod {

    public static String speedLimit (int speed  ){
        String result = "Over the speed limit , slow down or you will get a ticket";
        if(speed>65){
            return result;
        }else if(speed<65){
            result = "you are doing fine, keep driving";

        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(speedLimit(100));

    }
}
