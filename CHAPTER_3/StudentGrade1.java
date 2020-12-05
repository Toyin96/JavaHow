import javax.swing.JOptionPane;

public class StudentGrade1{
   
   public static void main(String[] args){  

     String grade = JOptionPane.showInputDialog("Welcome Student! Kindly enter your grade: ");
     int newResult = Integer.parseInt(grade);   

   String result = String.format("congrats! you passed the exam and your score is: %d", newResult);
   JOptionPane.showMessageDialog(null, result);
    
     }
  }