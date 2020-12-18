package com.timbuchalka;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a five-digit integer for a palindrome check: ");
        int num = scan.nextInt();

        System.out.println(isPalindrome(num));

    }


    public static int reverseNum (int number) {
        int revNum = 0;
            while (number > 0) {
                if (number <= 99999) {
                    int r = number % 10;
                    revNum = revNum * 10 + r;
                    number /= 10;
                }else{
                    System.out.println("You entered an invalid input!!!");
                    break;
                }
            }
        return revNum;
    }

    public static boolean isPalindrome (int number){
        if (number == reverseNum(number)){
            return true;
        }else{
            return false;
        }

    }
}
