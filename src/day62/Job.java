package day62;

import java.util.Objects;

public class Job implements Comparable<Job> {

   private int salary;
   private String company;

    public Job(int salary, String company) {
        this.salary = salary;
        this.company = company;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Job{" +
                "salary=" + salary +
                ", company='" + company + '\'' +
                '}';
    }

    @Override
    public int compareTo(Job o) {
        if(this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return salary == job.salary &&
                Objects.equals(company, job.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salary, company);
    }
}
