package day23;

public class ForEachLoop {

    public static void main(String[] args) {

        double[] price = {99.43, 84.32 , 544.43 , 53.56 , 78.89};
        //for each loop
        //it starts with for (  dataType (double) variableName (blahblah)         :  your array variable (price))

//        for (int x = 0; x <= price.length-1 ; x++) {
//
//            double eachPrice = price[x];
//            System.out.println(price[x]);
//
//
//        }
        
        for(  double  blah   : price){
            System.out.println("eachPrice = " + blah);
        }

        for(double ford : price){
            System.out.println("My discounts are "+ ford    );
        }
        
        
    }
}
