import java.util.Scanner;
import javax.swing.JOptionPane;
public class q1old{
  public static void main (String[]args){
    Scanner sn = new Scanner(System.in);
    System.out.print("Please enter 2 digits:");
    int digit = sn.nextInt();
    int bi5 = digit%2;
    int bi4 = (digit/2)%2;
    int bi3 = ((digit/2)/2)%2;
    int bi2 = (((digit/2)/2)/2)%2;
    int bi1 = ((((digit/2)/2)/2)/2)%2;
    int bi0 = (((((digit/2)/2)/2)/2)/2)%2;
    JOptionPane.showMessageDialog(null,"Binary value in each digit ="+bi0+""+bi1+""+bi2+" "+bi3+""+bi4+""+bi5);
    
  }

}