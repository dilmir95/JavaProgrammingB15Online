package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeAction{




    public static void main(String[] args) {

        HourlyEmployee h1 = new HourlyEmployee("Dilmurod",707,2000,15);




        SalaryEmployee s1 = new SalaryEmployee("Shoxsanam ",7070, 10000);


        Employee e1 = new SalaryEmployee("Dimka",909,10000);

        List<Employee> list1 = new ArrayList<>(Arrays.asList(h1,s1,e1));
        int totalSalaryExpense = 0;
        for(Employee each: list1){
           totalSalaryExpense+= each.calculateSalary();
            System.out.println(each.name +" earned the annual salary of: "+each.calculateSalary());
        }

        System.out.println("Total salary expenses for the year is: "+ totalSalaryExpense);
    }


}
