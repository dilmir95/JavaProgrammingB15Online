package day62;

import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class JobSetPractice {

    public static void main(String[] args) {

        Job j1 = new Job(100000,"Apple");
        Job j2 = new Job(105000,"Amazon");
        Job j3 = new Job(108000,"Twitter");
        Job j4 = new Job(109000,"HP");
        Job j5 = new Job(90000,"Oracle");

        SortedSet<Job> jobSet = new TreeSet<>(Arrays.asList(j1,j2,j3,j4,j5));
        Iterator<Job> jobIter = jobSet.iterator();
        while (jobIter.hasNext()){
            System.out.println(jobIter.next());
        }



    }
}
