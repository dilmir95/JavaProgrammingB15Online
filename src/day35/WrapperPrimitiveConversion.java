package day35;

public class WrapperPrimitiveConversion {

    public static void main(String[] args) {

        Integer num1 = 100;

        int num2 = new Integer(num1);

        int num3 = Integer.valueOf(100);
        int num4 = Integer.valueOf("100");

        int num5 = Integer.parseInt("100");

        Integer myAge = 24;

        int myAge1 = Integer.valueOf(myAge);

        Float newYear = 2020f;
        float f6 = Float.parseFloat("3.14f");

        System.out.println(f6);




        System.out.println("====================================");
//
//        String caseNumber = "IPR2012-000001";
//
//        String year = caseNumber.substring(3,caseNumber.indexOf("-"));
//
//        int yearNum = Integer.valueOf(year);
//        System.out.println(year);

        System.out.println(getYearOutOfCaseNumber("IPR2009-00002121"));


    }

    public static int getYearOutOfCaseNumber(String caseNumber){
        return Integer.valueOf(caseNumber.substring(3,7));

    }
}
