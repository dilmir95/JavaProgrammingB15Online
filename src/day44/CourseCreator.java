package day44;

import day43.Coffee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CourseCreator {

    public static void main(String[] args) {

        Course c1 = new Course("java","foundation");

        Course c2 = new Course("Selenium", "Automation");

        Course c3 = new Course("SQL", "Database");

        Course c4 = new Course("API", "WebServices");

        Course c5 = new Course("Agile", "Soft Skills");

        System.out.println(Course.counter);

        List<Course> list1 = new ArrayList<>(Arrays.asList(c1,c2,c3,c4,c5));

        for(Course each: list1){
            if(each.name.equalsIgnoreCase("java")){
                System.out.println(each);
            }
        }
    }
}
