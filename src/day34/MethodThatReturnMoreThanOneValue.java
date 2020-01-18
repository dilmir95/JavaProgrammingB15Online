package day34;

import java.util.Arrays;

public class MethodThatReturnMoreThanOneValue {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(boysVsGirls()));
    }

    public static int[] boysVsGirls(){
        int[] competition = {57,52};
        return  competition;

    }
}
