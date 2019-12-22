package day31;

public class VotingElegibility {

    public static void main(String[] args) {

        Voting(11);
    }

    public static void Voting (int age  ){
        if(age>18   ){
            System.out.println("You are elegible to vote");
        }else if(age<18){
            System.out.println("You are not eligable to vote!");
        }
    }
}
