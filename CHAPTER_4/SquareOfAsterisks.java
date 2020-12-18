package com.timbuchalka;

import java.util.Scanner;

public class SquareOfAsterisks {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the size of the side of a square (between 1 - 20): ");
        int input = scan.nextInt();

        if (input >= 1 && input <= 20) {
            for (int i = 1; i <= input; i++) {
                for (int counter = 1; counter <= input; counter++) {
                    System.out.print("* ");
                }
                System.out.println(" ");
            }
        }else{
            System.out.println("Invalid Number!!!\nEnter a number between 1 & 20.");
        }
    }
}
 