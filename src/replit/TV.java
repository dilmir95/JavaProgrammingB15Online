package replit;

public class TV {

    private int channel = 1;
    private int volumeLevel = 1;
    private boolean on = false;
    private String brand = "undefined";

    public TV(){
        System.out.println("Creating TV object using no Args- constructor");

    }
    public TV(String brand){
        this.brand = brand;
        System.out.println("Creating TV object using 1 arg - constructor");
    }
    public int getVolumeLevel (){
        return volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel){
        if(volumeLevel>=1 && volumeLevel<=7 && isOn()){
            this.volumeLevel = volumeLevel;
        }else{
            System.out.println("ERROR: TV is either OFF or invalid Volume level");
        }
    }
    public int getChannel(){
        return channel;
    }
    public void setChannel(int channel){
        if(channel<=0 || channel>120){
            System.out.println("ERROR: TV is either OFF or invalid Channel");
        }else{
            this.channel = channel;
        }
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void channelUp(){
        ++channel;
    }
    public void channelDown(){
        --channel;

    }
    public void volumeUp(){
        this.volumeLevel=this.volumeLevel+1;
    }
    public void volumeDown(){
        this.volumeLevel=this.volumeLevel-1;
    }
    public boolean isOn(){
        return on;
    }
    public void turnOn(){
        if(on){
            System.out.println("TV is already ON");
        }else{
           this.on = true;
        }

    }
    public void turnOff(){
        if(on){
            this.on = false;
        }else{
            System.out.println("TV is already OFF");
        }
    }

}
