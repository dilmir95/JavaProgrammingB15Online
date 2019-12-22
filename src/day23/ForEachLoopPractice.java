package day23;

public class ForEachLoopPractice {

    public static void main(String[] args) {


        long[] salaries = {100000, 110000,90000, 95000, 250000};
            long max = salaries[0];
            long sum = 0;
        for(long sal: salaries){
            sum+= sal;
            if(sal<100000){
                continue;
            }else if(max<sal){
                max = sal;
            }
            System.out.println(sal+" my desired salaries that are in 6 figures");

        }
        System.out.println(max);
        System.out.println(sum);


    }
}
