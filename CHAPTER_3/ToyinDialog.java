import javax.swing.JOptionPane;

    public class ToyinDialog{
     
      public static void main(String[] args){

    String name = JOptionPane.showInputDialog("What is your name broddy?");

    String message = String.format("Okay! %s, welcome to the world of programming", name);

     JOptionPane.showMessageDialog(null, message);

   }
}
