package CodingBat;

public class Test {

    void readCard(int cardNo) throws Exception{
        System.out.println("Reading card");
    }
    void checkCard(int cardNo) throws RuntimeException{
        System.out.println("checking card");
    }

    public static void main(String[] args) {
        Test t1 = new Test();
        int cardNo = 12344;

        int x=5;
        while(x>0){
            System.out.println(x--);
        }
    }
}
