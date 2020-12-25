package Chapter6;

import java.util.Scanner;

public class PerfectNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        isPerfect(num);
    }


    public static boolean isPerfect(int num) {

        int num1 = 0;
        for (int i = 1; i < num; i++) {

            if (num < 1000 && num % i == 0) {
                System.out.print(" " + i);
                num1 += i;
            }
        }if (num1 == num) {
            System.out.printf("%n%n%d is a perfect number%n", num);
            return true;
        }else{
            System.out.printf("%n%n%d is not a perfect number%n", num);
            return false;
        }
    }
}
