package day44;

public class CyberHouse {

    private int houseNum;
    private String design;
    static String neighborhoodName = "Cybertek";

    public CyberHouse(int houseNum, String design) {
        this.houseNum = houseNum;
        this.design = design;
    }

    public void showAllInfo(){
        System.out.println("the house number is:"+houseNum+" and the design is: "+design+" and it is located in: "+neighborhoodName);
    }

    public static void showNeighborhood(){
        System.out.println(neighborhoodName);
    }
}
