package day22;

public class LoopingWithArray {

    public static void main(String[] args) {


        int [] scores = new int[4];

        //assigning value to each index
        scores[0]= 95;
        scores[1]= 70;
        scores [2] = 88;
        scores[3]= 100;

        int itemCount = scores.length;


        for (int i = 0; i <=scores.length-1 ; i++) {
            System.out.println(scores[i]);
        }


        for (int j = scores.length-1; j >=0 ; j--) {
            System.out.println(scores[j]);
        }
    }
}
