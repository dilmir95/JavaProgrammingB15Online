package day48;

public class  HourlyEmployee extends Employee {

    int numOfHours;
    double hourlyWage;

    public HourlyEmployee(String name, int id, int numOfHours, double hourlyWage){
        super(name,id);
        this.numOfHours = numOfHours;
        this.hourlyWage = hourlyWage;

    }
    @Override
    public double calculateSalary(){
        double annualSalary;
        annualSalary = numOfHours*hourlyWage;
        return annualSalary;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "numOfHours=" + numOfHours +
                ", hourlyWage=" + hourlyWage +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", annual salary is: "+ calculateSalary()+
                '}';
    }


}
