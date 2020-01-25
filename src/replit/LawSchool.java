package replit;

public class LawSchool  extends EducationalInstitutes{

    public LawSchool(int duration){
        super(duration=3);
    }
    @Override
    public String graduationRequirements(){
        return "3 years of study and passing the bar";
    }


    public static void main(String[] args) {

        LawSchool l1 = new LawSchool(6);

        System.out.println(l1.duration);
    }
}
