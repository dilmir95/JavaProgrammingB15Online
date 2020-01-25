package day44;

import day43.Coffee;

public class CourseCreator {

    public static void main(String[] args) {

        Course c1 = new Course("java","foundation");

        Course c2 = new Course("Selenium", "Automation");

        Course c3 = new Course("SQL", "Database");

        Course c4 = new Course("API", "WebServices");

        Course c5 = new Course("Agile", "Soft Skills");

        System.out.println(Course.counter);


    }
}
