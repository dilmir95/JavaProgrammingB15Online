package day44.sub;

import day44.Appliances;

public class Refrigerator extends Appliances {

    int size;
    int shelveCount;

    public void freeze(){
        System.out.println("Fridge is freezing the food in freezer section");
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "size=" + size +
                ", shelveCount=" + shelveCount +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", voltage=" + voltage +
                ", does it have owner's manual? "+ haveOwnerManual+
                '}';
    }

    public Refrigerator(int size, int shelveCount, String brand, String type, int voltage) {
        this.size = size;
        this.shelveCount = shelveCount;
        this.brand = brand;
        this.type = type;
        this.voltage = voltage;
    }

    public static void main(String[] args) {
        Refrigerator r1 = new Refrigerator(36,10,"GE","french door", 120);

        System.out.println(r1);

    }
}
