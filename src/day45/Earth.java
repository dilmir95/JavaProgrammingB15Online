package day45;

public class Earth extends Planet{
    int population;


    public Earth(){

    }

    public Earth(double gravity, int radius, boolean hasLife, int population) {
        super(gravity, radius, hasLife);
        this.population = population;
    }

    public Earth(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }

    public static void main(String[] args) {
        Earth e1 = new Earth(9.81,5000,true,1875543) ;
        System.out.println(e1);
    }
}
