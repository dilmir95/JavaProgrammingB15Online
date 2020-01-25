package day44;

public class HouseBuilder {

    public static void main(String[] args) {

        CyberHouse.showNeighborhood();

        CyberHouse c1 = new CyberHouse(11234,"modern");

        CyberHouse.neighborhoodName = "Southwest Estates";
        CyberHouse.showNeighborhood();

        System.out.println(Short.MAX_VALUE);
    }
}
