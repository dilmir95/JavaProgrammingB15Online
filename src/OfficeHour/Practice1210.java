package OfficeHour;

public class Practice1210 {

    public static void main(String[] args) {

        String[] fruits = {"apple", "banana","grape","strawberry","blueberry","kiwi"};

        for (int i = 0; i < fruits.length ; i++) {
            String str = fruits[i];
//            if (str.endsWith("e")) {
////                System.out.println(str);
////            }

            if(!str.endsWith("e")){
                continue;
            }
            System.out.println(str);

        }
        System.out.println("===============================");

        for(String eachFruit: fruits){
            if(!eachFruit.endsWith("e")){
                continue;
            }
            System.out.println(eachFruit);
        }

        System.out.println("============");


        for (int i = 0; i <=fruits.length-1 ; i++) {
            String str = fruits[i];
            System.out.println(str.substring(str.length()-3));

        }

        float[] arr = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f}    ;
         float max = arr[0];
            float secondMax = arr[0];

        for (int i = 0; i <= arr.length-1 ; i++) {
            if(max<arr[i]){
                max= arr[i];

            }else if(arr[i]<max && secondMax<arr[i]){
                secondMax=arr[i];

            }

        }
        System.out.println(max+" max");
        System.out.println(secondMax+" Second max");
    }
}
