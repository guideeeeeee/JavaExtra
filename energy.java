import javax.swing.JOptionPane;
public class energy {
  public static void main (String[]args){
    String mass = JOptionPane.showInputDialog("Enter the amount of water in kilograms:");
    Double m = Double.parseDouble(mass);
    String itmep = JOptionPane.showInputDialog("Enter the Initial temperature:");
    Double it = Double.parseDouble(itmep);
    String ftemp = JOptionPane.showInputDialog("Enter the final temperature:");
    Double ft = Double.parseDouble(ftemp);
    Double q = m*(ft-it)*4184;
    String q1 = String.format("%.1f",q);
    JOptionPane.showMessageDialog(null,"The energy needed is  "+q1);
    
  }
}