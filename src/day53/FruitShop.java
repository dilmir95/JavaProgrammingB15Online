package day53;

public class FruitShop  {

    public static void main(String[] args) {

        Apple a1 = new Apple("sweet","red","Fuji");
        Fruit f1 = a1;
        Fruit f2 = new Orange("sour","orange",14);
        Fruit f4 = new Orange("sweet","blood red",10);
        Fruit f3 = new Apple("crispy","green","gala");


        a1.getDigested();
        disgestBetter(f4);


    }
    public static void disgestBetter(Fruit x){
        x.getDigested();
        x.getDigested();
        x.getDigested();
        x.getDigested();
    }
}
