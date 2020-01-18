package day42;

public class Computer {

    private String brand;
    private int ram;
    private double price;


    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        if(ram>=0 && ram<=128){
            this.ram = ram;
        }

    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        if(price>20){
            this.price = price;
        }


    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }
    public void calculate (){
        System.out.println(brand+" is calculating");
    }
    public void runProgram(){
        System.out.println(brand+" is running program with "+ram+" size of ram");
    }


}
