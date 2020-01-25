package day45;

public class University extends Education{

    String universityName;
    int numberOfdegrees;

    public University(String educationQuality, String teachingStyles, String universityName, int numberOfdegrees) {
        super(educationQuality, teachingStyles);
        this.universityName = universityName;
        this.numberOfdegrees = numberOfdegrees;
    }

    @Override
    public String toString() {
        return "University{" +
                "universityName='" + universityName + '\'' +
                ", numberOfdegrees=" + numberOfdegrees +
                ", educationQuality='" + educationQuality + '\'' +
                ", teachingStyles='" + teachingStyles + '\'' +
                '}';
    }

    public static void main(String[] args) {

        University u1 = new University("Good","Basic","Harvard",28);

        System.out.println(u1);

        u1.setEducationQuality("Poor");
        System.out.println(u1);
    }
}
