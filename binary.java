import java.util.Scanner;
public class binary{
  public static void main (String[]args){
    System.out.print("Enter value (0000-9999):");
    Scanner sn = new Scanner(System.in);
    int num = sn.nextInt();  
    int r = 1000;
    for (int i=0;i<=3;i++){
      int d = (num/r)%10;
      r=r/10;
      String binary = "";
      for(int j=0;j<=3;j++){
        int bi= d%2;
        binary = bi+binary ;
        d=d/2;
      }
      System.out.print(binary+" ");
    }
  }
}