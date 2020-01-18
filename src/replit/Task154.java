package replit;

public class Task154 {

    public static void main(String[] args) {
        int[] arr = {12,32,43,56,-1,-5,-9};
        for (int i = 0; i <arr.length ; i++) {
            isPos(arr[i]);
        }

    }

    public static void isPos(int num){
        if(num>0){
            System.out.println("positive");
        }else{
            System.out.println("not positive");
        }
    }
}
