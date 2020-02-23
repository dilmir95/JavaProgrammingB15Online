package day48;

public class Kangaroo implements Bouncible, Boxer {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void bounce() {
        System.out.println("Kangaroo named: "+name+" is bouncing");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    @Override
    public void box() {
        System.out.println("Kangaroo named: "+name+" likes to box");
    }

    @Override
    public void carryChildInThePocket() {
        System.out.println(name+" kangaroo carries child in her belly Pocket");
    }
}
