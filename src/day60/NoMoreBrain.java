package day60;

import java.io.IOException;

public class NoMoreBrain extends IOException {

    // checked exception
    //need to be handled or declared


}

class BrainFunction{
    public static void main(String[] args) throws Exception {

        throw new NoMoreBrain();

    }
}
