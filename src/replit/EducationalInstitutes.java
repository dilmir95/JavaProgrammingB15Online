package replit;

public class EducationalInstitutes {

    private int years;
    int duration;

    public EducationalInstitutes(int duration){
        this.duration = duration;
    }
    public String graduationRequirements(){
        return duration+" years of study";
    }

}
