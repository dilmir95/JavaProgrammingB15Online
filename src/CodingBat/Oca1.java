package CodingBat;

public class Oca1 {
    public static void main(String[] args) {
        String x =  " ";
        x.trim();
        System.out.println(x.equals(""));
        System.out.println("'"+x+"'");


        String str = "java";
        String str1 = new String ("JAVa");

        System.out.println(str.equalsIgnoreCase(str1));
    }


}
