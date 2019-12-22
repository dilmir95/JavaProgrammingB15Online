package day20;

public class FindDogInASentence {

    public static void main(String[] args) {

        String dogs = "I went out today and played soccer then i came back home and took my dog out for a walk" +
                "then i feed my dog.";

            int countOfDog = 0;


        for (int i = 0; i <= dogs.length()-3; i++) {
            String dogss = (dogs.substring( i, i+3));
            if(dogss.equalsIgnoreCase("dog")){
                System.out.println("bingo at "+i);
                countOfDog++;
            }


        }
        System.out.println(countOfDog+" count of dog");
    }
}
