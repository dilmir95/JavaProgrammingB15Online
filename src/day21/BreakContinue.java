package day21;

public class BreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <=5 ; x++) {
            System.out.println(x);

            if(x==5){ //no point of doing this break because the loop stops at 5 anyways (x<=5)
                break;

            }
            continue;  // nothing will happen if you put continue at the end of the loop because
                            // it is going to the next iteration by itself

        }
    }
}
