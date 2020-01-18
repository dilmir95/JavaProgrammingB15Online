package day33;

public class WarmUp {

    public static void main(String[] args) {
        System.out.println(getSpellName("dilmurod"));

    }


    public static String getSpellName ( String name){
        String concat ="";
        for (int i = 0; i <name.length() ; i++) {
            concat+= name.charAt(i);
            if(i != name.length()-1){
                concat+="-";
            }
        }
        return concat;
    }
}
