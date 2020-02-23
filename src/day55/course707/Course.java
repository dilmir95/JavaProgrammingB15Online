package day55.course707;

import java.util.ArrayList;
import java.util.List;

public class Course {

    String subject;

    List<String> studList = new ArrayList<>();

    public Course(String subject, List<String> studList) {
        this.subject = subject;
        this.studList = studList;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                ", studList=" + studList +
                '}';
    }
    public void addStudentName(String name){
        studList.add(name);
    }
    public void addManyStudentName(ArrayList<String> names){
        studList.addAll(names);
    }
}
