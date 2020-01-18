package OfficeHour;

public class PersonTesting {


    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setAll("Dilmurod","Yakubov", "12/07/1995");

        System.out.println(p1);

        p1.printInfo();
    }
}
