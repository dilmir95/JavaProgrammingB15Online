package Tasks;


import java.util.HashMap;
import java.util.Map;

public class JavaPrac1 {

    public static void main(String[] args) {
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);

        String x = "JJJjjjjCCCAAABBB";

        String[] chars = x.split("");

        Map<String,Integer> unique = new HashMap<>();


        for (String each : chars){
            int y = 1;

            if(!unique.containsKey(each)){

                unique.put(each,y);

            }else{

                unique.replace(each,unique.get(each)+1);

            }
        }

        System.out.println(unique);

        String uniqueChars = "";

        for (int i = 0; i <x.length() ; i++) {
            if(!uniqueChars.contains(x.charAt(i)+"")){
                uniqueChars+=x.charAt(i);

            }

        }
        System.out.println(uniqueChars);

        StringBuilder sb = new StringBuilder("dilmurod");
        System.out.println(sb.reverse().toString());
    }
}
