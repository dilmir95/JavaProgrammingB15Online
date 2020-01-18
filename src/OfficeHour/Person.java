package OfficeHour;

public class Person {

     String firstName;
     String lastName;
     String dob;

    public void setAll (String newFirstName, String newLastName, String newDob){
        firstName = newFirstName;
        lastName = newLastName;
        dob = newDob;
    }


    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                '}';
    }


    public void printInfo () {
        System.out.println(String.format("First name = %s, Last name = %s, Date of birth = %s", firstName,lastName,dob));
    }

}
