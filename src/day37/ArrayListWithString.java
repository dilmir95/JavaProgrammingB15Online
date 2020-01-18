package day37;

import java.util.*;



public class ArrayListWithString {

    public static void main(String[] args) {

        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Woman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");

//        for(String eachHero: superHeros){
//            if(!eachHero.contains("man")){
//               superHeros.remove(eachHero) ;
//            }
//        }
//        System.out.println(superHeros);

        for (int i = 0; i <superHeros.size() ; i++) {
            if(!superHeros.get(i).contains("man")){
                superHeros.remove(superHeros.get(i));
                --i;
            }
        }
        System.out.println("superHeros = " + superHeros);

        List<String> superHeroCopy = new ArrayList<>(superHeros);
        System.out.println(superHeroCopy);

        List<String> topics = Arrays.asList("java","selenium","API");

        List<String> topicsCopy = new ArrayList<>(topics);

    }
}
