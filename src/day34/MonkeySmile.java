package day34;

public class MonkeySmile {


    public static void main(String[] args) {
        System.out.println(monkeySmile(true,true));

        System.out.println(monkeySmile(true,false));

        System.out.println(monkeySmileV2(true,true));



    }

    public static boolean monkeySmile (boolean aSmile , boolean bSmile){

        if(aSmile && bSmile){
            return true;
        }else if(!aSmile && !bSmile){
            return true;
        }
        return false;
    }

    public static boolean monkeySmileV2(boolean aSmile , boolean bSmile){
        return (aSmile && bSmile || !aSmile&& !bSmile);

    }
}
