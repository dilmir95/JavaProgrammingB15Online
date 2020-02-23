package day48;

public class SalaryEmployee extends Employee {

    double monthlySalary;

    public SalaryEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double calculateSalary() {
        double annualSalary = monthlySalary*12;
        return annualSalary;
    }


    @Override
    public String toString() {
        return "SalaryEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", annual salary is: "+ calculateSalary()+
                '}';
    }

}
