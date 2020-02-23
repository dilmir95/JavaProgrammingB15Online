package day64;

import java.util.LinkedList;
import java.util.Queue;

public class QueueIntroDemo {

    public static void main(String[] args) {

        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.add("review the class");
        taskQueue.add("do your homework");
        taskQueue.add("attend class");
        taskQueue.add("say bye to java");


        System.out.println(taskQueue.remove());
        System.out.println(taskQueue);

        // FIFO data structure


    }
}
