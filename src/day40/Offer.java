package day40;

public class Offer {

    String location;
    String company;
    long salary;
    boolean isFullTime;

    public void displayInfo (){

        System.out.println("location is at: "+ location+
                            " and salary is: "+salary+" Company is: "+company+
                            " and it is a Full time job?"+ isFullTime);
    }
    public void turnToFullTime(){
        isFullTime = true;
    }

    public void changeLocation (String newLocation){
        location = newLocation;

    }
    public void changeAllInfo(String newLocation , String newCompany, long newSalary, boolean newIsFullTime){
        location = newLocation;
        salary = newSalary;
        company = newCompany;
        isFullTime  = newIsFullTime;

    }
    public boolean is100KClub(){
        if(salary>100000){
            return true;
        }
        return false;
    }

    public String toString (){
        return  ("location is at: "+ location+
                " and salary is: "+salary+" Company is: "+company+
                " and it is a Full time job?"+ isFullTime);


    }
}
