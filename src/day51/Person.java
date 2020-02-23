package day51;

public class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
//    @Override
//    public int compareTo(Person personito){
//        if(this.age> personito.age){
//            return 1;
//        }else if(this.age<personito.age){
//        return -1;
//        }else{
//        return 0;
//        }
//        }


    @Override
    public int compareTo(Person o) {
//        if(this.name.charAt(0)>o.name.charAt(0)){
//            return 1;
//        }else if(this.name.charAt(0)<o.name.charAt(0)){
//            return -1;
//        }else{
//            return 0;
//        }
//    }

        return this.name.compareTo(o.name);
    }
}