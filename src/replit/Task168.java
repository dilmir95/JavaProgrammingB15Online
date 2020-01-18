package replit;

public class Task168 {
    public static void main(String[] args) {

        System.out.println(waterTax(151));

        System.out.println(waterTax(50));

    }

    public static double waterTax(double units)
    {
        double bill = 0.0;

        //your code here
        if(units>150){
            bill = units*0.9 +100;
        }else if (units>100){
            bill= units*0.9+50;
        }else if(units>50){
            bill= units*0.9;
        }else{
            bill=units*0.6;
        }



        //end your code here


        return bill;
    }//end waterTax
}
