import java.util.Scanner;

   public class ToyinMaths2{

   public static void main(String[] args){

   int firstNum;

   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter your number: ");
   firstNum = input.nextInt();

  if (firstNum % 2 == 0)
     System.out.print("This number is an even number!");

  else
     System.out.print("This number is an odd number!");
   
     }
}