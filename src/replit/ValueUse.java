package replit;

import org.w3c.dom.ls.LSOutput;

public class ValueUse {



    public static void main(String[] args) {
        Value v1 = new Value(77);

        System.out.println(v1.getVal());
        System.out.println(v1.wasModified());
        Value v2 = new Value();
        v2.setVal(100);
        System.out.println(v2.getVal());

        System.out.println(v2.wasModified());

    }
}
