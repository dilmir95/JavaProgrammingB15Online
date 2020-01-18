package day42;

import java.util.*;

public class MovieActions {


    public static void main(String[] args) {

        Movie m1 = new Movie("Fast and Furious ", 3,"Action");
        Movie m2 = new Movie("Dracula", 3.2,"Fiction");
        Movie m3 = new Movie("Godfather", 2.5,"Drama");
        Movie m4 = new Movie("Mission Impossible", 2.4,"Action");
        Movie m5 = new Movie("Hobbs and Shaw", 3.5,"Action");
        Movie m6 = new Movie("Frozen 2", 2.3,"Family");
        Movie m7 = new Movie("Harry Potter", 1.4,"Fiction");
        Movie m8 = new Movie("John Wick", 1.2,"Action");
        Movie m9 = new Movie("Bad boys", 1.8,"Action");
        Movie m10 = new Movie("Madea", 3.4,"Comedy");





        List<Movie> list1 = new ArrayList<>(Arrays.asList(m1,m2,m3,m4,m5,m6,m7,m8,m9,m10));

        for(Movie each: list1){
            if(each.getLength()<2){

                System.out.println("Movies less than 2 hours:"+ each.getName());
            }

        }
        for(Movie each: list1){
            if(each.getType().equals("Action")){
                System.out.println("Action movies:" + each.getName());
            }
            if(each.getLength()>2){
                each.setType("Long"+each.getType());

            }
        }
        String longest = "";
        for (int i = 0; i <list1.size() ; i++) {
            if(list1.get(i).getName().length()>longest.length()){
                longest = list1.get(i).getName();
            }

        }

        System.out.println(longest);







    }
}
