package Chapter6;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        System.out.println("===========================================================================================================");

        System.out.println("Welcome to Multiples Detector \uD83D\uDE0A");

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a pair of integers to check (separate the two integers using the space character): ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println();

        System.out.println(isMultiples(num1, num2));

        System.out.println("=============================================================================================================");

    }

    public static boolean isMultiples(int num1, int num2) {
        return num2 % num1 == 0;
    }

}

