package CodingBat;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Base {

    public void test(){
        System.out.println("Base");
    }
}
class DerivedA extends Base{
    public void test(){
        System.out.println("Derived A");
    }
}
class DerivedB extends DerivedA{

    public void test(){
        System.out.println("Derived B");
    }

    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();
        b1= (Base)b3;
        Base b4 = (DerivedA)b3;
        b1.test();
        b4.test();
        double p,b,h;


        Boolean[] bool = new Boolean[2];
        bool[0] = true;
        bool[1] = new Boolean(null);

        System.out.println(bool[0]+""+ bool[1]);


            int[] num1 = {1,2,4};
            int[] num2 = {2,3,4,5,6};



            




    }

}

