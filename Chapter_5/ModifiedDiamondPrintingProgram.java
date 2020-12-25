package Chapter5;

import java.util.Scanner;

public class ModifiedDiamondPrintingProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an odd number between 1 - 19: ");
        int oddNum = scan.nextInt();

        diamondPrintingModifier(oddNum);
    }

    public static void diamondPrintingModifier(int oddNum) {

        if (oddNum >= 1 && oddNum < 20) {

            if (oddNum % 2 != 0) {

                int oddNumMinus1 = oddNum - 1;

                for (int a = 1; a <= oddNum; a++) {

                    for (int b = oddNumMinus1; b >= a; b--) {

                        if (a % 2 == 1) {

                            System.out.print(" ");
                        }
                    }

                    for (int c = 1; c <= a; c++) {

                        if (a % 2 == 1) {

                            System.out.print("* ");
                        }
                    }
                    if (a % 2 == 1) {
                        System.out.println();
                    }
                }

                for (int d = 1; d <= oddNum; d++) {

                    for (int e = 1; e <= d; e++) {

                        if (d % 2 == 0) {

                            System.out.print(" ");
                        }
                    }

                    for (int f = oddNumMinus1; f >= d; f--) {

                        if (d % 2 == 0) {

                            System.out.print("* ");
                        }
                    }
                    if (d % 2 == 0) {
                        System.out.println();
                    }
                }
            }else {
                System.out.println("The number you entered is not an odd number!!!");
            }
        }

    }
}

