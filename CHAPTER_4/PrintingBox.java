package com.timbuchalka;

public class PrintingBox {

    public static void main(String[] args) {


        for (int j = 1; j <= 4; j++) {
            for (int i = 1; i <= 4 ; i++) {

                if (i == 1 || j == 1 || i == 4 || j == 4) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
