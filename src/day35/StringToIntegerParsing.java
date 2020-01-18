package day35;

public class StringToIntegerParsing {


    public static void main(String[] args) {

        String id = "457";

        int num = Integer.parseInt(id);

        System.out.println(num);


        String empId = "DC-707";

        //int numId = Integer.parseInt(empId); cannot do it if it has chars
        /*
        Integer class is class coming from java.lang
        its primirily value used for wrapping up primitive value and treat it as an object

        parseInt is a static method of integer class
        it will turn a string that has only numbers into an int

         */
        int ide = Integer.parseInt(empId.split("-")[1]);

        System.out.println(ide);
        System.out.println("========================================================");
        String[] splitted = empId.split("-");
        String idOfEmployee = splitted[1];

        int empIdNum = Integer.parseInt(idOfEmployee);
        System.out.println(empIdNum);

        String num1 = "100";
        String num2 = "200";

        int num1Num = Integer.parseInt(num1);
        int num2Num = Integer.parseInt(num2);
        int sumNums = num1Num+num2Num;
        System.out.println(sumNums);

        System.out.println("OROROROROROROROROROROR");

        System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));

    }
}
