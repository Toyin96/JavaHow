// A decison making program using if statements

import java.util.Scanner;

   public class DecisionProgram {
   
      public static void main(String[] args){

         Scanner textReader = new Scanner(System.in);
         
         int firstDigit;
         int secondDigit;
   
         System.out.println("Enter first digit for comparison: ");
         firstDigit = textReader.nextInt(); 

         System.out.println("Enter first digit for comparison: ");
         secondDigit = textReader.nextInt(); 

         if (firstDigit == secondDigit) {
         System.out.println("The numbers are equal! Thanks for playing this game...");
         }

         if (firstDigit != secondDigit) {
         System.out.println("The first Digit is not equal to second Digit! Thanks for playing this game...");
         }
         
         if (firstDigit < secondDigit) {
         System.out.println("The first number is less than the second number! Thanks for playing this game...");
         }

         if (firstDigit > secondDigit) {
         System.out.println("The first digit is greater than the second digit! Thanks for playing this game...");
         }

         if (firstDigit <= secondDigit) {
         System.out.println("The first digit is less than or equal to the second digit! Thanks for playing this game...");
         }

         if (firstDigit >= secondDigit) {
         System.out.println("The first digit is greater than or equal to the second digit! Thanks for playing this game...");
         }
   
     }
}