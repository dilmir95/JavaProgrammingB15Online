package day19;

public class StairCaseForLoop    {


    public static void main(String[] args) {

        String star = "";
        int start =1;
        int end = 6;
        for (int i = start; i <=end ; i++) {
            star += "$";
            System.out.println(star);
        }

    }
}
