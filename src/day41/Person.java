package day41;

public class Person {

   private String name;
   private int age ;
    private long ssn;

    public void setAll(String newName , int newAge , long newSSN){
        name = newName;
        age = newAge;
        ssn = newSSN;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ssn=" + ssn +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;

    }
    public void setAge(int age){
        this.age = age;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }
}
