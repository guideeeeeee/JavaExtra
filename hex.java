import javax.swing.JOptionPane;
import java.util.Scanner;
public class hex{
  public static void main (String[]args){
   Scanner sn = new Scanner(System.in);
   System.out.print("Input Your binary number:");
   String x = sn.nextLine();
   String h1,h2;
   int sumh1 =0,sumh2 =0;
   int bi = Integer.parseInt(x);
   for (int i =0;i<=3;i++){
     sumh1= sumh1+((int)(bi/Math.pow(10,i)%10)*(int)Math.pow(2,i));
     System.out.println(i+" = "+sumh1);
   }
   System.out.println("result sumh1 ="+sumh1);
   for (int i =4;i<=7;i++){
     sumh2= sumh2+((int)(bi/Math.pow(10,i)%10)*(int)Math.pow(2,i-4));
     System.out.println(i+" = "+sumh2);
     }   
   System.out.println("result sumh2 ="+sumh2);
   System.out.println("result hexadecimal values = "+sumh2+""+sumh1);
   /*switch(sumh2){
     case 10:
       case 11:*/
   JOptionPane.showMessageDialog(null,"result hexadecimal values = "+sumh2+""+sumh1);
  }
}