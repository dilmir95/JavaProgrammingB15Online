package day43;

public class Coffee {

    private String type;
    private int caffeineLvl;
    private double price;

    public Coffee(String type, int caffeineLvl, double price) {
        this.type = type;
        this.caffeineLvl = caffeineLvl;
        setPrice(price);

    }
    public Coffee(){

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCaffeineLvl() {
        return caffeineLvl;
    }

    public void setCaffeineLvl(int caffeineLvl) {
        this.caffeineLvl = caffeineLvl;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            if(price>0){
                this.price = price;
            }else{
                this.price = 1;
            }


    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", caffeineLvl=" + caffeineLvl +
                ", price=" + price +
                '}';
    }
}
