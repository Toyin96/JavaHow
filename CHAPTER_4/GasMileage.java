//Assignment 4.17
// A program to calculate gas mileage

import java.util.Scanner;
  public class GasMileage {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

     int milesDriven = 1;
     int gallonsUsed = 1;
     double milesPerGallon = 0;

     double totalMilesPerGallonUsed = 0;

        System.out.print("Enter your miles driven or -1 to end program: ");
        milesDriven = scan.nextInt();

     while (milesDriven > 0){

         System.out.print("Enter your gallons per trip: ");
         gallonsUsed = scan.nextInt();

         milesPerGallon = (double) milesDriven/gallonsUsed;

         System.out.printf("Your miles per gallon is: %.2fMPG%n", milesPerGallon);

         System.out.print("Enter your miles driven or -1 to end program: ");
         milesDriven = scan.nextInt();

         totalMilesPerGallonUsed = totalMilesPerGallonUsed + milesPerGallon;

     }
           if (milesDriven == -1 ){
               System.out.printf("Your total miles per gallon used is: %.2fMPG", totalMilesPerGallonUsed);
        }else{
               System.out.println("No valid input was entered");
           }
    } // end of main method
 } // end class GasMileage