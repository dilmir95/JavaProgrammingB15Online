package OfficeHour;

public class Practice1205 {

    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
//        for(int i=10;i<=20;i++){
//            System.out.print(i);
//        }
//        System.out.println();
//
//        while(x<=20){
//            System.out.print(x);
//            x++;
//        }

        while(x<=20){
            if(x%3==0){
                sum+=x;

            }
            ++x;
        }
        System.out.println(x);
    }
}
