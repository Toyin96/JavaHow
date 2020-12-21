package Chapter5;

public class ModifiedDiamondPrintingProgram {

    public static void main(String[] args) {

    }

    public static void diamondPrintingModifier(int oddNum, int oddNumMinus1) {

        if (oddNum >= 1 && oddNum < 20) {

            if (oddNum % 2 != 0) {

                oddNumMinus1 = oddNum - 1;

                for (int a = 1; a <= oddNum; a++) {

                    for (int b = oddNumMinus1; b >= a; b--) {

                        System.out.print(" ");
                    }

                    for (int c = 1; c <= a; c++) {

                        System.out.print("* ");
                    }
                    System.out.println();
                }

                for (int d = 1; d <= oddNum; d++) {

                    for (int e = 1; e <= d; e++) {

                        System.out.print(" ");
                    }

                    for (int f = oddNumMinus1; f >= d; f--) {

                        System.out.print("* ");
                    }
                    System.out.println();
                }
            }else {
                System.out.println("The number you entered is not an odd number!!!");
            }
        }

    }
}

