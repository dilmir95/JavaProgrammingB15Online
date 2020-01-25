package day44;

public class Appliances {

    protected String brand;
    protected String type;
    protected int voltage;
    public static boolean haveOwnerManual = true;



    public void printOperatingVoltage(){
        System.out.println("this appliance works with: "+voltage+" volts");
    }

}
