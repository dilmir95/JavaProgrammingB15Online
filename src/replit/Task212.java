package replit;

public class Task212 {

    public static void main(String[] args) {

        String [][] money = {{"euro","5"},{"frank","10"}};
        String [][] convertionRate = {{"euro","2"},{"frank","10"}};
        double sum=0;
        for (int i = 0; i <money.length ; i++) {
            sum += Double.parseDouble(money[i][1]) * Double.parseDouble(convertionRate[i][1]);
        }
        System.out.println(sum  );


    }
}
