package Chapter6;

import java.util.Scanner;

public class ReversingDigitsDriver {

    public static void main(String[] args) {

        ReversingDigits newReverse = new ReversingDigits();

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int num = scan.nextInt();

        System.out.println(newReverse.reverseNumGetter(num));
    }
}
