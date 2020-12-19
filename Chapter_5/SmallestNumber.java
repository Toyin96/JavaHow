package com.timbuchalka;

import javax.swing.*;
import java.util.Scanner;

public class SmallestNumber {

    public static void main(String[] args) {

        int smallestNum = 0;
        int temp = 0;

        Scanner scan = new Scanner(System.in);


        String counter = JOptionPane.showInputDialog("Enter an integer for comparison: ");

        int newCounter = Integer.parseInt(counter);

        for (int count = 1; count <= newCounter; count++) {
            System.out.println("Enter an integer for comparison: ");
            temp = scan.nextInt();

            if (temp < smallestNum){
                smallestNum = temp;
            }
        }

        System.out.println(smallestNum + " is the smallest integer entered");
    }
}
