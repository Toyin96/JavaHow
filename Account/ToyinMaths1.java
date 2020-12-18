import java.util.Scanner;

   public class ToyinMaths1{

   public static void main(String[] args){

   int firstNum;
   int secondNum;
   int thirdNum;

   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter your first number: ");
   firstNum = input.nextInt();

   System.out.println("Enter your second number: ");
   secondNum = input.nextInt();

   System.out.println("Enter your third number: ");
   thirdNum = input.nextInt();
  
   int sum = (firstNum + secondNum) + thirdNum;
   int product = (firstNum * secondNum) * thirdNum;
   int remainder = (firstNum % secondNum) % thirdNum;
   int division = (firstNum / secondNum) / thirdNum;

   System.out.println("sum: " + sum + ", " + "product: " + product + ", " + "remainder: " + remainder + ", " + "division: " + division );

   }

}