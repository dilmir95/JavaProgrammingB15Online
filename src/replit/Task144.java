package replit;

public class Task144 {

    public static void main(String[] args) {

        int[][] arr = {{1,2,3,4,5},{4,4,5,5,6,},{7,8,9,0,1}};

        int matches=0;
        for (int[] eachArray: arr){
            for (int i = 0; i <eachArray.length-1 ; i++) {
                if(eachArray[i]==eachArray[i+1]){
                    ++matches;
                }
            }
        }
        System.out.println("matches: "+matches);
    }
}
