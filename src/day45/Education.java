package day45;

public class Education {

    protected String educationQuality;
    protected String teachingStyles;

    public String getEducationQuality(){
        return educationQuality;
    }
    public void setEducationQuality(String educationQuality){
        this.educationQuality = educationQuality;
    }
    public String getTeachingStyles(){
        return teachingStyles;
    }
    public void setTeachingStyles(String teachingStyles){
        this.teachingStyles = teachingStyles;
    }

    @Override
    public String toString() {
        return "Education{" +
                "educationQuality='" + educationQuality + '\'' +
                ", teachingStyles='" + teachingStyles + '\'' +
                '}';
    }
    public Education(){

    }
    public Education(String educationQuality,String teachingStyles){
        this.educationQuality = educationQuality;
        this.teachingStyles = teachingStyles;
    }

}
