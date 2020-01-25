package day45;

public class Electronics {

    String brand;
    static boolean useElectricity = true;

    public void showBrand(){
        System.out.println("the brand is: "+ brand);
    }
    public static void displayElectricity(){
        System.out.println("does it use electricity:"+ useElectricity);
    }

}
