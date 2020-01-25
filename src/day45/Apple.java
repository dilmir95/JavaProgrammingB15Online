package day45;

import day44.Appliances;

public class Apple extends Fruit{

    public Apple(){

        super("Red");//always add no arg constructor in your super class


        System.out.println("Aplle constructor message");
    }
    public static void main(String[] args) {
        Apple a1 = new Apple();


    }
}
