package com.timbuchalka;

public class Factorials {

    public static void main(String[] args) {

    factorialsCalculator();

    }

    public static void factorialsCalculator() {

        int factorialNum = 20;
        long result = 1;

        for (factorialNum = 20; factorialNum >= 1; factorialNum--){

            result *= factorialNum;

            System.out.println(result);
        }
        System.out.printf("%nThe Factorial of 20! is %d", result);
    }
}
