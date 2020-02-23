package day55.course707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseObjRunner {

    public static void main(String[] args) {

        Student s1 = new Student("dilmurod",707);
        Student s2 = new Student("bob",708);
        Student s3 = new Student("islom",709);
        Student s4 = new Student("nazar",701);
        Student s5 = new Student("nazar",701);



        List<Student> lst1 = new ArrayList<>(Arrays.asList(s1,s2,s3,s4));

        CourseStudentObj obj1 = new CourseStudentObj("java",lst1);

        System.out.println(obj1);

        obj1.addAStudent(new Student("hoshim",232));

        System.out.println(obj1);


    }
}
