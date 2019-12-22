package day18;

public class ForLoopEvenNumber {

    public static void main(String[] args) {

        for(int i =0;i<=20;i+=2){
            System.out.println("even number "+i);
        }


        for(int x = 1;x<=20;x+=2){
            System.out.println("odd number "+x);
        }

        for(int z=0;z<=100;++z){
            if(z%2==1){
                System.out.println("odd number "+z);
            }else if(z%2==0){
                System.out.println("even number "+z);
            }
        }

    }
}
