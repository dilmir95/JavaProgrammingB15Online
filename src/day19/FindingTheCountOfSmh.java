package day19;

public class FindingTheCountOfSmh {

    public static void main(String[] args) {

//        int count = 0;
//
//        for (int i = 1; i <=100 ; i++) {
//            if(i%15 == 0){
//                System.out.println(i);
//                ++count;
//
//
//            }
//
//        }
//        System.out.println(count);


        String name = "dilmurod";
        int countOfD = 0;
        for (int index = 0; index < name.length(); index++) {
            System.out.println(name.charAt(index));

            if(name.charAt(index)=='d'){
                System.out.println("bingo fount it");
                ++countOfD;

            }
        }
        System.out.println("count of d is "+ countOfD);
    }
}
