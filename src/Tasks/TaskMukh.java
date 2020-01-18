package Tasks;

public class TaskMukh {

    public static void main(String[] args) {


       // System.out.println(RemoveDup("aaabbbccc"));
        String words = "asasfasfsfs";

        System.out.println(freq("aaabbbcccaaa", 'a'));
        frequencyOfChars(words);

    }

    public static String RemoveDup (String word){
        String adjusted = "";
        for (int i = 0; i <word.length() ; i++) {
            if(!adjusted.contains(word.charAt(i)+"")){
                adjusted+=word.charAt(i);
            }
        }
        return  adjusted;

    }

    public static int freq (String y, char x){
        int count = 0;
            char []  chars = y.toCharArray();

            for( char each: chars){
                if(each==x){
                    ++count;
                }
            }


        return count;
    }
    public static void frequencyOfChars (String a ){
        String nonDup = RemoveDup(a);
        for (int i = 0; i <nonDup.length() ; i++) {
            int count = freq(a,nonDup.charAt(i));
            System.out.print(""+ nonDup.charAt(i)+count);
        }
    }
}
