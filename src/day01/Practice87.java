package day01;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.spi.AbstractResourceBundleProvider;

public class Practice87  {

    public static void main(String[] args) {

        System.out.println(locationBaby("javafjavaffdjavaabsaibfiasbfadubijava","java"));

        System.out.println(isBalanced("sbfusb(())("));
        int[] numbers = {-1,-4,-5};
        System.out.println(solution(numbers));
    }

    public static List<Integer> locationBaby(String string, String find){
        List<Integer> locations = new ArrayList<>();

        for (int i = 0; i <=string.length()-find.length() ; i++) {
            if(string.substring(i,i+find.length()).equals(find)){
                locations.add(i);
            }
        }

        return locations;
    }

    public static boolean isBalanced(String str){
        int countX = 0;
        int countY = 0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='('){
                ++countX;
            }else if(str.charAt(i)==')'){
                ++countY;
            }
        }
        return countX==countY;
    }

    public static int solution(int[] a){
        List<Integer> nums = new ArrayList<>();
        int max = a[0];
        int thatNumber = 0;

        for(int each: a){
            if(max<each){
                max=each;
            }
            if(each>0){
                nums.add(each);
            }
        }
        if(nums.isEmpty()){
            thatNumber=1;
        }

        for (int i = 1; i <=max+1 ; i++) {
            if(nums.contains(i)){
                continue;
            }else{
                thatNumber = i;
                break;
            }
        }
        return thatNumber;
    }
}
