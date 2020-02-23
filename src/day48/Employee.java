package day48;

public abstract class Employee {

    public String name;
    public int id;

    public Employee(String  name, int id){
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();
    public abstract String toString();


}
