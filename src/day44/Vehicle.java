package day44;

public class Vehicle {

     protected String make;
    private int year;
    int channel = 1;

    public void start (){
        System.out.println("Starting "+ make);
    }
    public void goForward (){
        System.out.println(make+ " is Going Forward");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
    public void channelUp(){
        ++channel;
    }

}
