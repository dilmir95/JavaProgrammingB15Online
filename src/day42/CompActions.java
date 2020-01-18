package day42;

public class CompActions {

    public static void main(String[] args) {

        Computer c1 = new Computer();

        c1.setBrand("Apple");
        c1.setRam(32);
        c1.setPrice(2000);

        c1.runProgram();
        c1.calculate();

        Computer c2 = new Computer();

        c2.setBrand("HP");
        c2.setPrice(c1.getPrice()/2);
        c2.setRam(c1.getRam()/4);

        System.out.println(c2);
    }
}
