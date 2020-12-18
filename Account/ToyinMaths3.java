import java.util.Scanner;

   public class ToyinMaths3{

   public static void main(String[] args){

   int firstNum;
   int square;
   int cube;
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter your number: ");
   firstNum = input.nextInt();

   if (firstNum <= 10)
    System.out.println(firstNum);
   
    square = firstNum * firstNum;
   cube = firstNum * firstNum * firstNum;

    else
    System.out.println("Sorry! this number cannot be processed at this time because its larger than 10");

    System.out.printf("%s%d%n%s%d", "square is: ", square, "cube: ", cube);
   

   }
}