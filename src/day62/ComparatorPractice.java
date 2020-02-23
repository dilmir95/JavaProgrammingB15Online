package day62;

import java.util.ArrayList;
import java.util.*;

public class ComparatorPractice {

    public static void main(String[] args) {

        List<Job> jobList = new ArrayList<>();


        Job j1 = new Job(100000,"Apple");
        Job j2 = new Job(105000,"Amazon");
        Job j3 = new Job(108000,"Twitter");
        Job j4 = new Job(109000,"HP");
        Job j5 = new Job(90000,"Oracle");
        jobList.addAll(Arrays.asList(j1,j2,j3,j4,j5));



        Iterator<Job> jobIter = jobList.iterator();
        while(jobIter.hasNext()){
            System.out.println(jobIter.next());
        }


        



    }
}
