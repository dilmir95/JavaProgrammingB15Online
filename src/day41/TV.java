package day41;

public class TV {

    String brand;
    boolean isOn;
    int currentChannel;


    public void turnOn (){


        if(!isOn){
            isOn = true;
        }
        System.out.println("The tv is on ");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("The tv is off");
    }
    public int getCurrentChannel() {
      return currentChannel;

    }
    public void setCurrentChannel(int x){

        if(x> 50 || x<0){
            System.out.println("Invalid channel");
            return;
        }
        currentChannel = x;

    }


    public String toString() {
        return "TV{" +
                "brand='" + brand + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
