package replit;

public class Task179 {

    public static void main(String[] args) {

        System.out.println(uniqueChars("dili"));
    }

    public static String uniqueChars(String str) {
        //TODO: write your below
        String uniqee = "";
            String[] splitted = str.split("");

        for (int i = 0; i <str.length() ; i++) {
            if(!uniqee.contains(splitted[i])){
                uniqee+= str.charAt(i);
            }
        }

        return uniqee;
    }
}