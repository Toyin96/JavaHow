import javax.swing.JOptionPane;

public class Addition{

   public static void main(String[] args){

        String input1;
        String input2;

    input1 = JOptionPane.showInputDialog("Enter first input: ");     

    input2 = JOptionPane.showInputDialog("Enter second input: ");
     
      int newInput1 = Integer.parseInt(input1);
      int newInput2 = Integer.parseInt(input2);
      int sum = newInput1 + newInput2; 

     String message = String.format("The sum is: %d", sum);

     JOptionPane.showMessageDialog(null, message);

    }
}