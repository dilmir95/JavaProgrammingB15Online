package replit;

import java.util.ArrayList;
import java.util.Arrays;

public class Task206 {

    public static void main(String[] args) {

        ArrayList<Boolean> list1 = new ArrayList<Boolean>();

        list1.add(true);
        list1.add(false);
        System.out.println(list1);
                int originalSize = list1.size();
        System.out.println(originalSize);
            int x =0;

            while(x!= originalSize) {
               list1.add(list1.get(x));

               ++x;
        }

        System.out.println(list1);
    }
}
