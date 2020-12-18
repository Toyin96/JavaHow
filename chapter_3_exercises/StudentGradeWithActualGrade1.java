import java.util.Scanner;

    public class StudentGradeWithActualGrade1{

      public static void main(String[] args){

      Scanner input = new Scanner(System.in);
      
      System.out.println("Kindly enter your score: ");
      double score = input.nextDouble();
      
   if (score > 100){
   System.out.println("Invalid score");
    }else 
       if (score >= 90  && score <= 100){
          System.out.println("Your school is: A");
            }else
               if(score >=65 && score < 90){
                System.out.println("Your school is: B");
                 }else  
                    if(score >=60 && score < 65){
                    System.out.println("Your school is: C");
                      }else
                         if(score >=50 && score < 60){
                         System.out.println("Your school is D");
                            }else
                              if (score <50){
                                 System.out.println("Your school is: F");
                                   }

    }
}