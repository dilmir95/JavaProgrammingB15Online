package day43;

public class Pet {

    private String name;
    private String breed;



    public String getName(){
        return name;
    }
    public void setName (String name){
        this.name = name;
    }
    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;

    }
    public Pet(){
        this.name = "noname";
        this.breed = "unknown";
    }
    public Pet(String name, String breed){
        this.name = name;
        this.breed = breed;
    }
    public void speak (){
        if(this.name.equalsIgnoreCase("cat")){
            System.out.println("meow");
        }else if(this.name.equalsIgnoreCase("dog")){
            System.out.println("woof");
        }else if(this.name.equalsIgnoreCase("cow")){
            System.out.println("Moo");
        }else if(this.name.equalsIgnoreCase("horse")){
            System.out.println("neiNei");
        }


    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }

}
