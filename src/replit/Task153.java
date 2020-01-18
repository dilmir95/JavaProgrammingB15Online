package replit;

public class Task153 {

    public static void main(String[] args) {

        person("Dilmurod,Yalubov,24");
    }

    public static void person(String info){
        String[] eachInfo = info.split(",");
        System.out.println("person name: "+eachInfo[0]+" last name: "+eachInfo[1]+" age: "+eachInfo[2]);
    }
}
