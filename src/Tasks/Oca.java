package Tasks;
import java.util.*;
public class Oca {

    public static void main(String[] args) {

        String ta = "A ";
        ta = ta.concat("B ") ;
        String tb = "C ";
        ta = ta.concat(tb);
        ta.replace('C','D');
        ta = ta.concat(tb);
        System.out.println(ta);


        List<String> names = new ArrayList<>();
        names.add("Robb");

        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if (names.remove("Bran")){
            names.remove("Jon"); }
        System.out.println(names);

        String[] arr = {"A", "B","C","D"};
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " "); if (arr[i].equals("C")){
                continue; }

        }
        System.out.println("Work done");
    }
}
