package OfficeHour;

import java.util.List;

public class School {

    String schoolName;
    List<Student> allStudentList;

    public School(String schoolName, List<Student> allStudentList) {
        this.schoolName = schoolName;
        this.allStudentList = allStudentList;
    }

    public void addNewStudent(Student x){
        allStudentList.add(x);
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", allStudentList=" + allStudentList +
                '}';
    }
}
