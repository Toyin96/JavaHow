import java.util.Scanner;

public class StudentGrade{
   
   public static void main(String[] args){

     Scanner userInput = new Scanner(System.in);      
     System.out.print("Welcome Student! Kindly enter your grade ");
     int grade = userInput.nextInt();

    if (grade >= 60){
       System.out.printf("print %d", grade);
      }
  }

}