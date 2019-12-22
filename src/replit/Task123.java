package replit;

public class Task123 {

    public static void main(String[] args) {
        int total = 0;
        int growth = 1;
        for (int i = 1; i <=10 ; i++) {
            if(i<=3){
                growth=1;
                ++total;
                System.out.println("year "+i+" - growth "+ growth+" cm");
                System.out.println("tree size: "+total+"cm");

            }else if(i<=10){
                growth=2;
                total+=2;
                System.out.println("year "+i+" - growth "+ growth+" cm");
                System.out.println("tree size: "+total+"cm");

            }
        }
    }
}
