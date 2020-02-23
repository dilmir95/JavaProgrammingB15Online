package replit;

import java.util.Objects;

public class Dog extends Animal {

    String breed;
    int humanYears;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;

    }

    @Override
    public String toString() {
        return "Name: "+getName()+"\n"+"Breed: "+breed+"\n"+"Age in calendar years: "+getAge()+"\n"+"Age in human years: "+humanYears;
    }

    @Override
    public int getAgeInHumanYears() {
        if(getAge()<=2){
             humanYears=(getAge()*11);
        }else{
             humanYears= 22+((getAge()-2)*5);
        }
        return humanYears;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return this.getName().equals(dog.getName())&& this.getAge() == dog.getAge() && this.breed.equals(dog.breed);
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getHumanYears() {
        return humanYears;
    }

    public void setHumanYears(int humanYears) {
        this.humanYears = humanYears;
    }
}
