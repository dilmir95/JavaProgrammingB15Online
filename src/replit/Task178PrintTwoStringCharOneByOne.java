package replit;

public class Task178PrintTwoStringCharOneByOne {

    public static void main(String[] args) {

        System.out.println(mergeStrings("dilmir","shox"));

//        String name = "dadadas";
//        char[] chars = name.toCharArray();


    }

    public static String mergeStrings(String one, String two) {
        String result = "";
        for (int i = 0; i <one.length() || i<two.length() ; i++) {
            if(i<one.length()){
                result+= one.charAt(i);
            }if(i<two.length()){
                result+= two.charAt(i);
            }
        }




        return   result;
    }
}
