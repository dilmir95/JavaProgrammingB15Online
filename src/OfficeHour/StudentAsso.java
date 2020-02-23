package OfficeHour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentAsso {

    public static void main(String[] args) {

        Student s1 = new Student("Dilmurod");
        Student s2 = new Student("Abdu");
        Student s3 = new Student("Bobur");
        Student s4 = new Student("Islom");
        Student s5 = new Student("Nazar");

        List<Student> cybertekStudents = new ArrayList<>(Arrays.asList(s1,s2,s3,s4,s5));

        School school1 = new School("Cybertek",cybertekStudents);

        school1.addNewStudent(new Student("Denis"));
        school1.addNewStudent(new Student("Irina"));

        for(Student each: cybertekStudents){
            System.out.println(each.studentName);
        }




    }
}
