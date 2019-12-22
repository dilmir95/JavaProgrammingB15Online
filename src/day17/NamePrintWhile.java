package day17;

public class NamePrintWhile {

    public static void main(String[] args) {


        String name = "Dilmurod Yakubov";
        int namelength = name.length();
        int x = 0;
        while(x<namelength){
            System.out.println(name.charAt(x));
            ++x;
        }

      int xx = 0;
        while(xx<namelength){
            System.out.print(xx+" index: ");
            System.out.println(name.charAt(xx));
            ++xx;
        }

    }
}
