package day56;

public class Singleton {

    public static Singleton instance;

    private Singleton() {
        System.out.println("calling constructor");
    }

    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }else{
            System.out.println("cannot create object");
        }
        return instance;
    }

}
