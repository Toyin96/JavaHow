package com.timbuchalka;

import java.util.Scanner;

public class ProductOfOddIntegers {

    public static void main(String[] args) {

       int result = oddNumCalc();

        System.out.println(result);

    }


    public static int oddNumCalc() {
        int oddNumProduct = 1;

        for (int i = 1; i <= 15; i++) {

            if (i % 2 != 0) {
                oddNumProduct *= i;
            }
        }
        return oddNumProduct;
    }

}