package Chapter5;

public class DiamondPrintingProgram {

    public static void main(String[] args) {


        for (int i = 1; i <= 9; i++) {

            for (int k = 8; k >= i; k--) {
                if(i % 2 == 1) {
                    System.out.print(" ");
                }
            }

            for (int m = 1; m <= i; m++) {
                if(i % 2 == 1) {

                    System.out.print("* ");
                }
            }
            if(i % 2 == 1) {
                System.out.println();
            }
        }

        for (int n = 1; n <= 9; n++) {

            for (int o = 1; o <= n; o++) {

                if (n % 2 == 0) {

                    System.out.print(" ");
                }
            }

            for (int p = 8; p >= n; p--) {

                if (n % 2 == 0) {

                    System.out.print("* ");
                }
            }
            if (n % 2 == 0) {
                System.out.println();
            }
        }
    }

}


