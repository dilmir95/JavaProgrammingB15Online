package day33;

import day21.BreakContinue;

public class MethodWithReturn {





    public static void main(String[] args) {


        System.out.println(convertNumToDay(2));

        System.out.println(convertNumToDay(5));

        System.out.println(convertNumToDay(9));
        System.out.println("================================");
        int[] allCodes = {12,3,5,7,88,51};
        for (int i = 0; i <allCodes.length ; i++) {
            System.out.println(convertNumToDay(allCodes[i]));
        }
    }


    public static String convertNumToDay(int dayNum){
        String day = "";

            switch (dayNum) {
                case 1:
                    day= "Monday";
                break;
                case 2:
                    day= "Tuesday";
                break;
                case 3:
                    day= "Wednesday";
                break;
                case 4:
                    return "Thursday";
                case 5:
                   day= "Friday";
                break;
                case 6:
                    day= "Saturday";
                    break;
                case 7:
                    day= "Sunday";
                    break;
                default:
                    day= "Invalid Day";
            }


        return  day;
    }
}
