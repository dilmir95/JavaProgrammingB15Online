package day41;

public class TvStore {

    public static void main(String[] args) {


        TV t1 = new TV();

        t1.brand = "Sony"   ;

        t1.turnOn();


        if(t1.isOn){
            t1.setCurrentChannel(60);
        }
        System.out.println(t1.getCurrentChannel());

        System.out.println(t1);



    }
}
