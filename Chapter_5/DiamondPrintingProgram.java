package Chapter5;

public class DiamondPrintingProgram {

    public static void main(String[] args) {


        for (int i = 1; i <= 5; i++) {

            for (int k = 4; k >= i; k--) {

                System.out.print(" ");
            }

            for (int m = 1; m <= i; m++) {

                System.out.print("* ");
            }
            System.out.println();
        }

        for (int n = 1; n <= 5; n++) {

            for (int o = 1; o <= n; o++) {

                System.out.print(" ");
            }

            for (int p = 4; p >= n; p--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

}


