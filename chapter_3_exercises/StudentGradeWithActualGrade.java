import java.util.Scanner;

    public class StudentGradeWithActualGrade{

      public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      System.out.println("Kindly enter your score: ");
      double score = input.nextDouble();
      
      if (score > 100){
         System.out.println("Invalid score");
       }

      if(score >= 90  && score <= 100){
         System.out.println("Your grade is: A");
         }
 
      if(score >=65 && score < 90){
         System.out.println("Your grade is: B");
         }

      if(score >=60 && score < 65){
         System.out.println("Your grade is: C");
         }
   
      if(score >=50 && score < 60){
         System.out.println("Your grade is: D");
         }
      
       if (score <50){
         System.out.println("Your grade is F");
         }

    }
}