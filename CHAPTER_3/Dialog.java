// A dialogbox program accepting and diplaying a message

   import javax.swing.JOptionPane;

   public class Dialog{

     public static void main(String[] args){

   String name = JOptionPane.showInputDialog("What is your name? ");

   String message = String.format("Welcome %s, to the programming world of Java", name);

   JOptionPane.showMessageDialog(null, message);
   }
}