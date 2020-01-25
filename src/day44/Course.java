package day44;

public class Course {

    private String name;
    private String type;

    public static int counter;

    public Course(String name, String type) {
        this.name = name;
        this.type = type;
        ++counter;

    }

}
