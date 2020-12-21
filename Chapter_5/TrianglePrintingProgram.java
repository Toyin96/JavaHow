package com.timbuchalka;

public class TrianglePrintingProgram {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){

            for (int j = 1;j <= i; j++){

                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        for (int counter = 1; counter <= 10; counter++){

            for (int count = 10;count >= counter; count--){

                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 5; i++){

            for (int k = 4; k >= i; k--){

                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){

                System.out.print("* ");
            }

            System.out.println();
        } // Triangle

        System.out.println();

        for (int t = 1; t <= 10; t++){

            for (int k = 9; k >= t; k--){

                System.out.print(" ");
            }
            for (int j = 1; j <= 10; j++){

                System.out.print("* ");
            }

            System.out.println();
        } // parallelogram

        System.out.println();

        for (int m = 1; m <= 5; m++){

            for (int p = 4; p >= m; p--){
                System.out.print("  ");
            }

            for (int n = 1; n <= m; n++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        for (int q = 5; q >= 1; q--){

            for (int r = 4; r >= q; r--){
                System.out.print("  ");
            }

            for (int s = 1; s <= q; s++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
