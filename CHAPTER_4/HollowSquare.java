package com.timbuchalka;

import java.util.Scanner;

public class HollowSquare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter shape number of a square : ");
        int space = scanner.nextInt();

        if (space >= 1 && space <= 20) {
            for (int i = 1; i <= space; i++) {
                for (int k = 1; k <= space; k++) {
                    if (i == 1 || k == 1 || i == space || k == space) {
                        System.out.print("x");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("You entered a wrong number!!!\nPlease enter a number between 1 & 20");
        }
    }
}
