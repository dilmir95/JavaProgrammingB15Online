package day64;

import java.util.Deque;
import java.util.LinkedList;

public class DequeDemo {
    public static void main(String[] args) {
        
        //Last in First out

        Deque<String> lifoDeque = new LinkedList<>();
        lifoDeque.add("review the class");
        lifoDeque.add("do your homework");
        lifoDeque.add("attend class");
        lifoDeque.add("say bye to java");

        System.out.println("lifoDeque.removeLast() = " + lifoDeque.removeLast());



        
    }
}
