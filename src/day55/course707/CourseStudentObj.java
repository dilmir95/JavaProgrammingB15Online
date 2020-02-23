package day55.course707;

import java.util.List;

public class CourseStudentObj {

    String topic;
    List<Student> studentLst;

    public CourseStudentObj(String topic, List<Student> studentLst) {
        this.topic = topic;
        this.studentLst = studentLst;
    }

    @Override
    public String toString() {
        return "CourseStudentObj{" +
                "topic='" + topic + '\'' +
                ", studentLst=" + studentLst +
                '}';
    }
    public void addAStudent (Student x){
        studentLst.add(x);
    }
}

class Student{
     private String name;
         private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId=" + studentId +
                '}';
    }
}
