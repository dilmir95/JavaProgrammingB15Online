package OfficeHour;

public class GetUniqueChars {

    public static void main(String[] args) {

        String s1 = "aabbcc";
        String s2 = "";

        for (int i = 0; i <s1.length() ; i++) {
            String eachChar = ""+s1.charAt(i);
            if( !s2.contains(eachChar)){
                s2+= eachChar;
            }
        }
        System.out.println(s2);

        System.out.println("======================================");

        String any = "aabbdsdsaasssaaaaeeewqqqw";
        String result= "";

        String[]    eachChar = any.split("");
        for(String each: eachChar){
            if(!result.contains(each)){
                result+=each;
            }
        }
        System.out.println(result);
    }
}
