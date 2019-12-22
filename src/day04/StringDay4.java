package day04;

public class StringDay4 {
    public static void main(String[] args) {
        String firstName = "Dilmurod";
        String lastName = "Yakubov";
        System.out.println("my first name is "+ firstName);
        System.out.println("My last name is "+lastName);
        System.out.println("My first name is "+ firstName+ " and my last name is "+ lastName);
        System.out.println("My full name is "+firstName +"\t" +lastName);
        String fullName = firstName+ "\t"+ lastName;
        String productName = "Fire";
        String model = "HD";
        int version = 8;
        float price = 79.99f;
        System.out.println("I saw "+ productName+ "\t"+model + "\t"+ version+ " for the price of "+ price);
        System.out.println("I saw "+ productName + " "+ model +" " + version+ " for "+ price);
        System.out.println("I saw "+productName+ " "+ model+ " "+ version+ "\n for "+price);

    }
}
