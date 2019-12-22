package day23;

public class ForEachLoopMore {

    public static void main(String[] args) {


        long[] salaries = {100000, 110000,90000, 95000, 250000};

        long maxSalary = salaries[0];
        for (long salary : salaries) {
            if(salary>maxSalary){
                maxSalary=salary;
            }
        }

        System.out.println(maxSalary+" maxed out");
    }
}
