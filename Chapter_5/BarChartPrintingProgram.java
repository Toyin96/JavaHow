package Chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int temp = scan.nextInt();

        System.out.println("Enter an integer: ");
        int temp2 = scan.nextInt();

        System.out.println("Enter an integer: ");
        int temp3 = scan.nextInt();

        System.out.println("Enter an integer: ");
        int temp4 = scan.nextInt();

        System.out.println("Enter an integer: ");
        int temp5 = scan.nextInt();

        System.out.println(" ");

       for (int k = 1; k <= temp; k++){
           System.out.print("* ");
       }
        System.out.println();

        for (int i = 1; i <= temp2; i++){
            System.out.print("* ");
        }

        System.out.println();

        for (int j = 1; j <= temp3; j++){
            System.out.print("* ");
        }

        System.out.println();

        for (int i = 1; i <= temp4; i++){
            System.out.print("* ");
        }

        System.out.println();

        for (int i = 1; i <= temp5; i++){
            System.out.print("* ");
        }

        System.out.println();
    }
}
