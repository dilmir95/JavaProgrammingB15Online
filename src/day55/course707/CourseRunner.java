package day55.course707;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseRunner {

    public static void main(String[] args) {

        List<String> lst = new ArrayList<>(Arrays.asList("dil","shox","bob"));

        Course c1 = new Course("Java",lst);
        System.out.println(c1);

        c1.studList.add("dilmurod");
        c1.addStudentName("Hasan");
        c1.addStudentName("Harry");

        System.out.println(lst);

        c1.addManyStudentName(new ArrayList<>(Arrays.asList("Bobur","Islom")));
        System.out.println(c1);
    }
}
