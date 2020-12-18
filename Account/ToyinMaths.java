// A program to add integers

   import java.util.Scanner;

   public class ToyinMaths{

      public static void main(String[] args){
      
         Scanner input = new Scanner(System.in);
          
         int firstDigit;
         int secondDigit;
         int sum;

         System.out.println("Enter first digit here: ");
         firstDigit = input.nextInt();

         System.out.println("Enter second digit here: ");
         secondDigit = input.nextInt();

         System.out.printf("The sum is %d%n", firstDigit + secondDigit);


         }

}